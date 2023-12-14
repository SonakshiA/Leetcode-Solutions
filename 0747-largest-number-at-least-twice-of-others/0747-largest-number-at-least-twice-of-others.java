class Solution {
    public int dominantIndex(int[] nums) {
        int largest = 0;
        int index=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]>largest){
                largest=nums[i];
                index=i;
            }
        
        
       for(int i=0;i<nums.length;i++){
           if(i!=index){
               if(nums[i]*2>largest)
                   return -1;
           }
       }
        return index;
    }
}