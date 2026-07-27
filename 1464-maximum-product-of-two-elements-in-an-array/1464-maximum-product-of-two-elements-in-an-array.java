class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        return ((nums[len-1]-1)*(nums[len-2]-1));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna