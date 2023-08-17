class Solution {
    int f(int index, int buy, int[] prices,int[][] dp){
        if(index==prices.length){
            return 0;
        }
        int profit = 0;
        
        if(dp[index][buy]!=-1) return dp[index][buy];
        
        if(buy==1){
            profit = Math.max(-prices[index]+f(index+1,0,prices,dp),0+f(index+1,1,prices,dp)); 
        }else{
            profit = Math.max(prices[index]+f(index+1,1,prices,dp),0+f(index+1,0,prices,dp));
        }
        
        return dp[index][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        return f(0,1,prices,dp);
    }
}

// on buying we - the prices and on selling we + the price