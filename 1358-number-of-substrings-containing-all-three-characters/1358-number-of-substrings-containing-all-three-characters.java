class Solution {
    private boolean hasAllChars(int[] freq) {
        return freq[0] > 0 && freq[1] > 0 && freq[2] > 0;
    }

    public int numberOfSubstrings(String s) {
       int left = 0, right = 0;
       int len = s.length();
       int count = 0;
       int[] freqCount = new int[3];

       while(right < len){
           freqCount[s.charAt(right) - 'a']++;
           while(hasAllChars(freqCount)) {
                count+= len - right;
                freqCount[s.charAt(left) - 'a']--;
                left++;
           }
           right++;
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna