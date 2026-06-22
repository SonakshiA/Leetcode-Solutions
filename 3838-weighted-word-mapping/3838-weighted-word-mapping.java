class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        for(String word: words){
            int sum = 0;
            char[] arr = word.toCharArray();
            for (char ch: arr) {
                sum += weights[ch - 'a'];
            }
            sum = sum%26;
            System.out.println(sum);
            char ch = (char) (122 - sum);
            sb.append(ch);
        }
        return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna