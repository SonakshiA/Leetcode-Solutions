class Solution {
    public int minimumDeletions(int[] nums) {
        // find indices
        int min = Integer.MAX_VALUE;
        int index_min = 0;
        int max = Integer.MIN_VALUE;
        int index_max = 0;
        int len = nums.length;

        for(int i = 0 ; i < len ; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index_min = i;
            } if (nums[i] > max) {
                max = nums[i];
                index_max = i;
            }
        }

        // once we have indices, there are 3 ways we can find
        // all from front, all from back, from both front and back

        int front_and_back = len - Math.max(index_min, index_max) + Math.min(index_min, index_max) + 1;
        int front = Math.max(index_min, index_max) + 1;
        int back = len - Math.min(index_min, index_max); 

        return Math.min(front_and_back, Math.min(front,back));
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna