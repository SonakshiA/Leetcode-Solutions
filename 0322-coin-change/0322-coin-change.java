class Solution {
    private int f(int index, int target, int[][] dp, int[] coins){
        if(index==0){
            if(target%coins[0]==0) return target/coins[0];
            else return (int)Math.pow(10,9);
        }
        
        if(dp[index][target]!=-1) return dp[index][target];
        
        int notPick = 0 + f(index-1,target,dp,coins);
        int pick = (int)Math.pow(10,9);
        
        if(coins[index]<=target){
            pick = 1 + f(index,target-coins[index],dp,coins);
        }
        
        return dp[index][target] = Math.min(pick,notPick);
    }
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[coins.length][amount+1];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        int res = f(coins.length-1,amount,dp,coins);
        
        return res!=(int)Math.pow(10,9)?res:-1;
    }
}