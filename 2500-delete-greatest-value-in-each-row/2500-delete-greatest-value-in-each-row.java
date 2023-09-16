class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int[] row: grid){
            Arrays.sort(row);
        }
        
        int ans = 0;
        for(int i=0;i<grid[0].length;i++){
             int max = Integer.MIN_VALUE;
            for(int j=0;j<grid.length;j++){
                 max = Math.max(max,grid[j][i]);
            }
            ans+=max;
        }
        return ans;
    }
}