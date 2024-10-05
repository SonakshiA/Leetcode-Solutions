class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int M = s1.length();
        int N = s2.length();
        
        int[] count = freq(s1);
        int[] counter = freq(s2.substring(0,M));

        if(isSame(count,counter)) return true;

        for(int i=M;i<N;i++){
            counter[s2.charAt(i-M)-'a']--;
            counter[s2.charAt(i)-'a']++;

            if(isSame(count,counter)){
                return true;
            }
        }
        return false;
    }

    private boolean isSame(int[] x, int[] y){
        for(int i=0;i<26;i++){
            if(x[i]!=y[i]){
                return false;
            }
        }
        return true;
    }

    private int[] freq(String s){
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        return count;
    }
}