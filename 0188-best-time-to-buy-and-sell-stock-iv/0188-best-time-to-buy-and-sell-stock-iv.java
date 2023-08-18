class Solution {
    private int f(int index, int buy, int cap, int[] prices, int[][][] dp){
        if(cap==0 || index == prices.length){
            return 0;
        }
        
        if(dp[index][buy][cap]!=-1) return dp[index][buy][cap];
        int profit = 0;
        
        if(buy==1){
            profit = Math.max(-prices[index]+f(index+1,0,cap,prices,dp),0+f(index+1,1,cap,prices,dp));
        }else{
            profit = Math.max(prices[index]+f(index+1,1,cap-1,prices,dp),0+f(index+1,0,cap,prices,dp));
        }
        
        return dp[index][buy][cap] = profit;
    }
    public int maxProfit(int k, int[] prices) {
        int[][][] dp = new int[prices.length][2][k+1];
        
        for(int[][] mat:dp){
            for(int[] row:mat){
                Arrays.fill(row,-1);
            }
        }
        
        return f(0,1,k,prices,dp);
    }
}