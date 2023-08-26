class Solution {
    int f(int num, int[] dp){
        if(num<=1){
            return num;
        }
        
        if(dp[num]!=-1) return dp[num];
        
        return dp[num] = f(num-1,dp) + f(num-2,dp);
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        
        Arrays.fill(dp,-1);
        
        return f(n,dp);
    }
}