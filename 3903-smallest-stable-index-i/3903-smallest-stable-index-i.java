class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] max_array = new int[n];
        int[] min_array = new int[n];
        max_array[0] = nums[0];
        min_array[n-1] = nums[n-1];
        int max = nums[0];
        int min = nums[n-1];

        for(int i = 1; i < n; i++) {
            max_array[i] = Math.max(max_array[i-1], nums[i]);
        }

        for(int i = n-2; i>=0; i--) {
            min_array[i] = Math.min(nums[i], min_array[i+1]);
        }

        int[] instab_score = new int[n];

        for(int i = 0; i<n;i++){
            instab_score[i] = max_array[i] - min_array[i];
            if (instab_score[i] <=k){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna