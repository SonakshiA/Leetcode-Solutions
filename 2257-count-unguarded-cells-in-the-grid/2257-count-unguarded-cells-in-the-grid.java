class Solution {
    private static final int GUARDED = -1;
    private static final int GUARD = 1;
    private static final int WALL = 2;
    
    private void markCells(int row, int col, int[][] map){
        int m = map.length;
        int n = map[0].length;
        
        //mark cells to the left of guard
        for(int c=col-1;c>=0;c--){
            if(map[row][c]==GUARD || map[row][c]==WALL)
                break;
            map[row][c] = GUARDED;
        }
        
        //mark cells to the right of guard
        for(int c = col+1; c<n; c++){
            if(map[row][c]==GUARD || map[row][c]==WALL)
                break;
            map[row][c] = GUARDED;
        }
        
        //mark cells above guard
        for(int r=row-1;r>=0;r--){
            if(map[r][col]==GUARD || map[r][col]==WALL)
                break;
            map[r][col] = GUARDED;
        }
        
        //mark cells below guard
        for(int r=row+1;r<m;r++){
            if(map[r][col]==GUARD || map[r][col]==WALL)
                break;
            map[r][col] = GUARDED;
        }
    }
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] map = new int[m][n];
        
     
        for(int[] guardCoord : guards){
            map[guardCoord[0]][guardCoord[1]] = GUARD;
        }
        
        for(int[] wallCoord : walls){
            map[wallCoord[0]][wallCoord[1]] = WALL;
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]==GUARD){
                    markCells(i,j,map);
                }
            }
        }
        
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(map[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}