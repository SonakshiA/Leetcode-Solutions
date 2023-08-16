class Solution {
    private boolean isAllStars(int i, String p){
        for(int j=0;j<=i;j++){
            if(p.charAt(j)!='*') return false;
        }
        return true;
    }
    
    private int f(int i, int j, String s, String p, int[][] dp){
        if(i<0 && j<0) return 1;
        if(i<0 && j>=0) return 0;
        
        if(i>=0 && j<0){
            return isAllStars(i,p) ? 1:0;
        }
        
        if(dp[i][j]!=-1) return dp[i][j];
        
        if(p.charAt(i)==s.charAt(j) || p.charAt(i)=='?'){
            return dp[i][j] = f(i-1,j-1,s,p,dp);
        }
        
        else{
            if(p.charAt(i)=='*'){
                return dp[i][j] = (f(i-1,j,s,p,dp)==1 || f(i,j-1,s,p,dp)==1) ? 1 : 0;
            }else{
                return dp[i][j] = 0;
            }
        }
    }
    public boolean isMatch(String s, String p) {
        int n = p.length();
        int m = s.length();
        
        int[][] dp = new int[n][m];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        return f(n-1,m-1,s,p,dp)==1?true:false;
    }
}