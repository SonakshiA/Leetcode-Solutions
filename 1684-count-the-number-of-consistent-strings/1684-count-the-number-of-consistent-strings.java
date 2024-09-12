class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        int[] map = new int[26];
        for(char ch:allowed.toCharArray()){
            map[ch-'a']++;
        }
        
        for(String word:words){
            int flag=1;
            for(char ch:word.toCharArray()){
                if(map[ch-'a']==0){
                    flag=0;
                }
            }
            if (flag==1) ans++;
        }
        return ans;
    }
}