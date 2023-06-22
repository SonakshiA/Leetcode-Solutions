class Pair{
    int first;
    int second;
    
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Solution {
    
    private void bfs(int[][] vis, char[][] grid, int startRow, int startCol){
        vis[startRow][startCol] =1;
        
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(startRow, startCol));
        
        int n = grid.length;
        int m = grid[0].length;
        
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            
            for(int delRow = -1; delRow<=1; delRow++){
                for(int delCol = -1; delCol<=1; delCol++){
                                      
                    if((delRow==-1 && delCol==-1) || (delRow== -1 && delCol==1) || (delRow==1 && delCol                     == -1) || (delRow==1 && delCol==1)){
                        continue;
                    }
                    
                    
                    int nRow = row + delRow;
                    int nCol = col + delCol;
                    
                    if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && grid[nRow][nCol]=='1' && vis[nRow][nCol]==0){
                        vis[nRow][nCol] = 1;
                        q.add(new Pair(nRow,nCol));
                    }
                }
            } 
            
        } 
        
    }
    
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        int[][] vis = new int[n][m];
        
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<m ; j++){
                if(vis[i][j] == 0 && grid[i][j]=='1'){
                    bfs(vis,grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}