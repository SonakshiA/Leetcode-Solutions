class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;

        for(int[] account: accounts){
            int temp = 0; 
            for(int amount: account){
                temp+=amount;
            }
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}