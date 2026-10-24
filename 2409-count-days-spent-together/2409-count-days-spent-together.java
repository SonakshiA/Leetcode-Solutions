class Solution {
    private int convertToDays(String day, int[] days) {
        int m = (day.charAt(0)-'0')*10 + (day.charAt(1)-'0');
        int d = (day.charAt(3)-'0')*10 + (day.charAt(4)-'0');

        int res = d;
        for(int i =0;i<m-1;i++){
            res += days[i];
        }
        return res;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int alexStart = convertToDays(arriveAlice, days);
        int alexEnd = convertToDays(leaveAlice, days);
        int bobStart = convertToDays(arriveBob, days);
        int bobEnd = convertToDays(leaveBob, days);

        int start = Math.max(alexStart, bobStart);
        int end = Math.min(alexEnd, bobEnd);

        if (start<=end){
            return (end-start+1);
        }
        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna