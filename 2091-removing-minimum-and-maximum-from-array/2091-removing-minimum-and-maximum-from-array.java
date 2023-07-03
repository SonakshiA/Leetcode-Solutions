class Solution {
    public int minimumDeletions(int[] nums) {
        int minIndex=0;
        int maxIndex=0;
        
        int minVal = Integer.MAX_VALUE;
        int maxVal = Integer.MIN_VALUE;
        
        for(int i =0; i<nums.length;i++){
            if(nums[i]<minVal){
                minVal=nums[i];
                minIndex=i;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>maxVal){
                maxVal=nums[i];
                maxIndex=i;
            }
        }
        
        int left = Math.min(minIndex,maxIndex);
        int right = Math.max(minIndex,maxIndex);
        
        int op1 = right+1;
        int op2 = nums.length-left;
        int op3 = (left+1) + (nums.length-right);
        
        System.out.println(op1 + " " + op2 + " " + op3);
        
        if(op1<= op2 && op1<=op3)
            return op1;
        if(op2<=op3 && op2<=op1)
            return op2;
        return op3;
    }
}

/*
either both from start
either both from end
one from start and one from end

[2,10,7,5,4,1,8,6]
2 left 7 5 4 right 8 6
*/