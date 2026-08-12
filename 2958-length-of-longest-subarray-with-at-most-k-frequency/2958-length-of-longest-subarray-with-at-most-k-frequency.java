class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int ans =0, start = -1;
        for(int end = 0; end < nums.length; end++) {
            freq.put(nums[end], freq.getOrDefault(nums[end],0)+1);
            while (freq.get(nums[end])>k) {
                start++;
                freq.put(nums[start], freq.getOrDefault(nums[start],0)-1);
            }
            ans = Math.max(ans, end - start);
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna