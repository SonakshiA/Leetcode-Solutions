class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int i = 0; i < n ; i++) {
            if (s.charAt(i) == '(') {
                count++;
                if(count > 1) {
                    sb.append(s.charAt(i));
                }
            } else {
                count--;
                if(count > 0) {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna