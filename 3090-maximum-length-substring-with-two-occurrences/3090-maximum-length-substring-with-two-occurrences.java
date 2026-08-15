class Solution {
    public int maximumLengthSubstring(String s) {
        int start = -1, ans = 0;
        int len = s.length();
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int end = 0; end<len; end++) {
            freq.put(s.charAt(end), freq.getOrDefault(s.charAt(end),0)+1);
            while(freq.get(s.charAt(end)) > 2) {
                start++;
                freq.put(s.charAt(start), freq.getOrDefault(s.charAt(start),0)-1);
            }
            ans = Math.max(ans, end - start);
        }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna