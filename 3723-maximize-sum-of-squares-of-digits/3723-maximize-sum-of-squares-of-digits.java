class Solution {
    public String maxSumOfSquares(int num, int sum) {
        StringBuilder sb = new StringBuilder();
        if (sum > 9 * num) {
            return "";
        }
        if(sum<10) {
            sb.append(sum);
            for(int i=1;i<num;i++){
                sb.append("0");
            }
            return sb.toString();
        }

        int needed_digits = num;

        while(sum>=9){
            sb.append("9");
            needed_digits--;
            sum-=9;
        }
        if (sum > 0) {
            sb.append(sum);
            needed_digits--;
        }
        while(needed_digits>0){
            sb.append("0");
            needed_digits--;
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna