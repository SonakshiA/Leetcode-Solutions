class Solution {
    public int f(int[] prices, int index, int buy, int[][] dp){
        if (index>=prices.length)
            return 0;
        
        if(dp[index][buy]!=-1) return dp[index][buy];
        
        int profit = 0;
        if(buy==1){ //we can buy a stock
            profit = Math.max(-prices[index] + f(prices,index+1,0,dp), 0 + f(prices,index+1,1,dp));
        }else{ //we cannot buy, we must sell the stock
            //if we sell, we go to index+2 and not index+1 since we cannot buy the day after selling
            profit = Math.max(prices[index] + f(prices,index+2,1,dp), 0 + f(prices,index+1,0,dp));
        }
        return dp[index][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2]; //buy can be 0 and 1, so [2]
        
        for(int[] row:dp)
            Arrays.fill(row,-1);
        
        return f(prices,0,1,dp);
    }
}