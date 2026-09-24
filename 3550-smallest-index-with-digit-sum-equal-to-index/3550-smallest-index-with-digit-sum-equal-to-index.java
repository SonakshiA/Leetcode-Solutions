class Solution {
    private int sumOfDigits(int x) {
        int sum = 0;
        while(x>0) {
            int rem = x%10;
            x = x/10;
            sum += rem;
        }
        return sum;
    }

    public int smallestIndex(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if (sumOfDigits(nums[i]) == i) {
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna