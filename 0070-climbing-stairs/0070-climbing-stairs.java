class Solution {
    private int solve(int n, int[] dp){
        if(n<=2)
            return n;
        
        if(dp[n]!=-1)
            return dp[n];
        return dp[n] = solve(n-1,dp) + solve(n-2,dp);
    }
    public int climbStairs(int n) {
       int[] dp = new int[n+1];
       Arrays.fill(dp,-1);
       return solve(n,dp);
       
    }
}

/*

if n==0, 0 ways to climb
if n==1, 1 way to climb
if n==2, 2 ways to climb (take 1 jump or 2 jumps)

*/

