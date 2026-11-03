class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        for(int x: nums){
            if (x>max){
                max = x;
            }
        }
        int ans = 0;
        for(int x: nums) {
            ans += max - x;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna