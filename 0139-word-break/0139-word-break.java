class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        HashSet set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(set.contains(s.substring(j,i)) && dp[j]){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}