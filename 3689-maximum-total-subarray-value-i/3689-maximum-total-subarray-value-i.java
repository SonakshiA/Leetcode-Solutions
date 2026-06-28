class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        long diff = nums[nums.length - 1] - nums[0];

        return diff * k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna