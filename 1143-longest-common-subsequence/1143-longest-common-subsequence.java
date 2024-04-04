class Solution {
    private int f(String text1, String text2, int i1, int i2, int[][] dp){
        if(i1<0)
            return 0;
        if(i2<0)
            return 0;
        
        if(dp[i1][i2]!=-1) return dp[i1][i2];
        
        if(text1.charAt(i1)==text2.charAt(i2)){
            return dp[i1][i2] = 1 + f(text1,text2,i1-1,i2-1,dp);
        }
        
        return dp[i1][i2] = Math.max(f(text1,text2,i1-1,i2,dp),f(text1,text2,i1,i2-1,dp));
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        return f(text1,text2,text1.length()-1,text2.length()-1,dp);
    }
}