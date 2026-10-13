class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        int[] nums_copy = new int[n];

        int lower = 0, higher = n-1;
        long ans = 0;

        for(int i =0;i<n;i++){
            nums_copy[i] =  Math.abs(nums[i]);
        }
        Arrays.sort(nums_copy);

        while(lower < higher) {
            ans += Math.pow(nums_copy[higher],2) - Math.pow(nums_copy[lower],2);
            lower++;
            higher--;
        }
        if(n%2==1) ans += Math.pow(nums_copy[n/2],2);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna