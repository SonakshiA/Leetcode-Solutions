class Solution {
    private int f(int ind, int buy, int cap, int[] prices, int[][][] dp){
        if(cap==0 || ind==prices.length){
            return 0;
        }
        
        if(dp[ind][buy][cap]!=-1) return dp[ind][buy][cap];
        int profit = 0;
        if(buy==1){
            profit = Math.max(-prices[ind] + f(ind+1,0,cap,prices,dp),
                             0+f(ind+1,1,cap,prices,dp));
        }else{
            profit = Math.max(prices[ind]+f(ind+1,1,cap-1,prices,dp),0+f(ind+1,0,cap,prices,dp));
        }
        return dp[ind][buy][cap] = profit;
    }
    public int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][2][3];
        
        for(int[][] mat:dp){
            for(int[] row:mat){
                Arrays.fill(row,-1);
            }
        }
        
        return f(0,1,2,prices,dp);
    }
}