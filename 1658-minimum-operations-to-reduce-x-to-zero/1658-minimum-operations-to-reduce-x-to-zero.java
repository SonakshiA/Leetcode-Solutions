class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int num: nums)
            sum+=num;

        int target = sum - x;
        int left = 0;
        int s = 0;
        int size = -1;
        int n = nums.length;

        for(int right = 0; right < n; right++){
            s += nums[right];

            while(left<=right && s > target) {
                s -= nums[left++];
            }

            if (s == target) {
                size = Math.max(size, right - left + 1);
            }
        }
        return size != -1 ?  n - size : -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna