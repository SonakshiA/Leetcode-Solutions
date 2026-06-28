class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans = 0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=i;j<n;j++){
                cnt += (nums[j] == target ? 1 : -1);
                if (cnt > 0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna