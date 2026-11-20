class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // low score at least 0
        // we have to minimize the high score or/and minimize the low score
        // high score: max abs diff
        return Math.min(nums[n-2] - nums[1], Math.min(nums[n-3]-nums[0], nums[n-1] - nums[2]));
    }
}

// 1,4,5,7,8
// change:
// 4,4,5,7,7
// 3 + 0 = 3

// 1,4,5,5,5 : 4 + 0 = 4

// 5,5,5,7,8 :

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna