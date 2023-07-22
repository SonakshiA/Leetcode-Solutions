class Solution {
    public int[] runningSum(int[] nums) {
        int[] prefix_sum = new int[nums.length+1];
        
        for(int i=1;i<=nums.length;i++){
            prefix_sum[i] = prefix_sum[i-1] + nums[i-1];
        }
        
        for(int i = 1;i<prefix_sum.length;i++){
            nums[i-1] = prefix_sum[i];
        }
        return nums;
    }
}