class Solution {
    
    private int f(int index, int target, int[] coins,int[][] dp){
        if(index==0){
            return target%coins[0]==0?1:0;
        }
        
        if(dp[index][target]!=-1) return dp[index][target];
        
        int notPick = f(index-1,target,coins,dp);
        int pick = 0;
        
        if(coins[index]<=target){
            pick = f(index,target-coins[index],coins,dp);
        }
        
        return dp[index][target] = pick+notPick;
    }
    public int change(int amount, int[] coins) {
        int[][] dp = new int[coins.length][amount+1];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        
        return f(coins.length-1,amount,coins,dp);
    }
}