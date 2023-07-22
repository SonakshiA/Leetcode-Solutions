class Solution {
    public int findMin(int[] nums) {
        int pivot = 0;
        
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<nums[pivot])
                return nums[pivot+1];
            else
                pivot++;
        }
        return nums[0];
    }
}