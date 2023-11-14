class Solution {
    public int rearrangeCharacters(String s, String target) {
        int[] targetMap = new int[26];
        
        for(int i=0;i<target.length();i++){
            targetMap[target.charAt(i)-'a']++;
        }
        
        int[] sMap = new int[26];
        for(int i=0;i<s.length();i++){
            sMap[s.charAt(i)-'a']++;
        }
        
        int ans = Integer.MAX_VALUE;
        
        for(int i=0;i<26;i++){
            if(targetMap[i]!=0){
                ans = Math.min(ans,sMap[i]/targetMap[i]);
            }
        }
        return ans;
    }
}