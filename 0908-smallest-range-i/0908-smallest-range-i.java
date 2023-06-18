class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        
        int min = nums[0];
        int max = nums[nums.length-1];
        
        int diff = (max-k) - (min+k);
        
        return (diff>0) ? diff: 0;
    }
}