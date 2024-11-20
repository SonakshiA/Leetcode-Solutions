class Solution {
    public int maximumLengthSubstring(String s) {
        int start = 0;
        int n = s.length();
        int maxWindow = 0;
        while(start<n){
            int end = start;
            int[] count = new int[26];
            while(end<n){
                count[s.charAt(end)-'a']++;
                if(count[s.charAt(end)-'a']>2){
                    break;
                }
                end++;
            }
            start++;
            maxWindow = Math.max(maxWindow, end-start+1);

        }
        return maxWindow;
    }
}