class Solution {
    public int maxProfit(int[] prices) {
         int buy = prices[0];
        int maxProfit = 0;

        for (int i : prices) {
            int profit = i - buy;
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            if (buy > i) {
                buy = i;
            }
        }
        return maxProfit;
    }
}