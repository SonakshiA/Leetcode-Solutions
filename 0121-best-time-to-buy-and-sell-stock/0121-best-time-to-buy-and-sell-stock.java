class Solution {
    public int maxProfit(int[] prices) {
         int buy = prices[0];
        int maxProfit = 0;

        for (int i : prices) {
            int profit = i - buy;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            //buy on a day with lower price
            if (buy > i) {
                buy = i;
            }
        }
        return maxProfit;
    }
}