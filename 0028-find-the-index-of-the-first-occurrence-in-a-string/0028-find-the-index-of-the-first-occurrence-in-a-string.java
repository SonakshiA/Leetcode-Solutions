class Solution {
    public int strStr(String haystack, String needle) {
         int needleLen = needle.length();
        int haystackLen = haystack.length();

        if(needleLen>haystackLen){
            return -1;
        }

        int start = 0, end = needleLen;

        while(end<=haystackLen){
            String subs = haystack.substring(start,end);

            if(subs.equals(needle)) {
                return start;
            } else{
                start++;
                end++;
            }
        }
        return -1;
    }
}