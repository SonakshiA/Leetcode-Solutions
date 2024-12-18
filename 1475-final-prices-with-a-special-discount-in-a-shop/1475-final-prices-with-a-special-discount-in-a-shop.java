class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        
        for(int i=0;i<n;i++){
            boolean found = false;
            for(int j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    ans[i]=prices[i]-prices[j];
                    found = true;
                    break;
                }
            }
            if(!found){
                ans[i] = prices[i];
            }
        }
        return ans;
    }
}