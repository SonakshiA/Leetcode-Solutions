class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int start = 0;
        int len = s.length();
        int ans = 0;
        while(start<len){
            int zeroes=0, ones=0;
            int end=start;
            while(end<len){
                if(s.charAt(end)=='0') zeroes++;
                else ones++;
                
                if(zeroes<=k || ones<=k) ans++;
                else break;
                end++;
            }
            start++;
        }
        return ans;
    }
}