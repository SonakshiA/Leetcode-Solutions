class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return b[1] - a[1];
        });

        int low = intervals[0][0];
        int high = intervals[0][1];
        int ans = intervals.length;

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] == low || intervals[i][1] <= high) {
                ans--;
            } else {
                low = intervals[i][0];
                high = intervals[i][1];
            }
        }
        return ans;
    }
}

/*
[[1,4],[2,8],[3,6]]

 [[1,2],[1,4],[3,4]] -> [[1,4],[1,2],[3,4]]
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna