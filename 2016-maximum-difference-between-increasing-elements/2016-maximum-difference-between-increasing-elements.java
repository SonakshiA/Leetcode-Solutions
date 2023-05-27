class Solution {
    public int maximumDifference(int[] nums) {
         int maxDiff = -1;
        int first = nums[0];

        for (int i : nums) {
            int diff = i - first;

            if (diff > maxDiff && diff!=0) {
                maxDiff = diff;
            }

            if (i < first){
                first = i;
            }
        }
        return maxDiff;
    }
}