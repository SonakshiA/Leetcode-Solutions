class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int opt1 = nums[0] * nums[1] * nums[len-1];
        int opt2 = nums[len-1] * nums[len-2] * nums[len-3];

        return Math.max(opt1,opt2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna