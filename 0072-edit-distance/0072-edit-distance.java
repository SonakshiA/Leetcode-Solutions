class Solution {
    private int f(int i1, int i2,String word1, String word2, int[][] dp){
        
        //base case
        if(i1<0){
            return i2+1;
        } 
        if(i2<0){
            return i1+1;
        }
        
        if(dp[i1][i2]!=-1) return dp[i1][i2];
        
        //if matches
        if(word1.charAt(i1)==word2.charAt(i2)){
            return 0 + f(i1-1,i2-1,word1,word2,dp);
        }
        
        else{
            return dp[i1][i2] = 1 + Math.min(f(i1,i2-1,word1,word2,dp),Math.min(f(i1-1,i2,word1,word2,dp),
                               f(i1-1,i2-1,word1,word2,dp)));
        }
    }
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[n][m];
        
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return f(n-1,m-1,word1,word2,dp);
        
    }
}

//i1 and i2-1 is the case where we insert at the end of word1
// i1-1 and i2 is where we delete from the end of word1
//i-1 i2-1 is where we replace and make characters at i1 i2 same