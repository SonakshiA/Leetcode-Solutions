class Solution {
    public int maxSubArray(int[] nums) {
       int sum = 0;
       int max = Integer.MIN_VALUE;

        for (int x : nums) {
            sum += x;
            max = Math.max(sum, max);
            if (sum < 0) sum = 0;
        }
        return max;
    }
}


//KADANES ALGORITHM USED