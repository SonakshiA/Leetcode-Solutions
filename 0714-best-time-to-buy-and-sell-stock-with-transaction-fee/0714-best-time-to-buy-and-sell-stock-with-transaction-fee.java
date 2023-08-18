class Solution {
    private int f(int index, int buy, int fee, int[] prices,int[][] dp){
        if(index==prices.length){
            return 0;
        }
        
        if(dp[index][buy]!=-1) return dp[index][buy];
        int profit = 0;
        
        if(buy==1){
            profit = Math.max(-prices[index] + f(index+1,0,fee,prices,dp),0+f(index+1,1,fee,prices,dp));
        }else{
            profit = Math.max(prices[index]-fee+f(index+1,1,fee,prices,dp),0+f(index+1,0,fee,prices,dp));
        }
        
        return dp[index][buy] = profit;
    }
    public int maxProfit(int[] prices, int fee) {
        int[][] dp = new int[prices.length][2];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        return f(0,1,fee,prices,dp);
    }
}