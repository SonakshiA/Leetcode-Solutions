class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int start = 0;
        int n = nums.size();
        int min = Integer.MAX_VALUE;
        while(start < n) {
            int end = start;
            int sum = 0;
            while(end < n) {
                sum += nums.get(end);
                int size = end - start + 1;
                if(sum < min && sum > 0 && size>=l && size<=r) {
                    min = sum;
                }
                end++;
            }
            start++;
        }
        return min!=Integer.MAX_VALUE ? min : -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna