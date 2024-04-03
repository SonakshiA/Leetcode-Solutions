class Solution {
    int f(int[][] dp, int index, int target, int[] coins){
        if(index==0){
            return (target%coins[index]==0?1:0);
        }
        
        if (dp[index][target]!=-1) return dp[index][target];
        
        int notPick= f(dp,index-1,target,coins);
        int pick = 0;
        if(coins[index]<=target){
            pick = f(dp,index,target-coins[index],coins);
        }
        
        return dp[index][target] = pick + notPick;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(dp,coins.length-1,amount,coins);
    }
}