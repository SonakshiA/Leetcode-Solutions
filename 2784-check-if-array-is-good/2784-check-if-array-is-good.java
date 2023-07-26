class Solution {
    public boolean isGood(int[] nums) {
        int max = 0;
        for(int num:nums){
            if(num>max)
                max= num;
        }
        
        int[] baseArray = new int[max+1];
        int index = 0;
        for(int i=1;i<=max-1;i++){
            baseArray[index++] = i;
        }
        //appending twice
        for(int i=0;i<2;i++){
            baseArray[index++] = max;
        }
        System.out.println(Arrays.toString(baseArray));
        if(baseArray.length!=nums.length) return false;
        Arrays.sort(nums);
        Arrays.sort(baseArray);
        
        return Arrays.equals(nums,baseArray);
    }
}