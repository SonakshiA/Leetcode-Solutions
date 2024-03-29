class Pair{
    int row;
    int col;
    
    public Pair(int r, int c){
        row = r;
        col = c;
    }
}

class Solution {
    int ans = 0;
    public int bfs(int[][] grid, int[][] vis, int startRow, int startCol){
        int size=1;
        vis[startRow][startCol] = 1;
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startRow,startCol));
        
        while(!q.isEmpty()){
            int row = q.peek().row;
            int col = q.peek().col;
            q.remove();
            for(int delRow=-1;delRow<=1;delRow++){
                for(int delCol=-1;delCol<=1;delCol++){
                    
                    if((delRow==-1 && delCol==-1) ||(delRow==-1 && delCol==1) ||(delRow==1 && delCol==-1) ||(delRow==1 && delCol==1)){
                        continue;
                    }
                    int nRow = delRow + row;
                    int nCol = delCol + col;
                    
                    if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && grid[nRow][nCol]==1 && vis[nRow][nCol]==0){
                        vis[nRow][nCol]=1;
                        q.add(new Pair(nRow,nCol));
                        size++;
                    }
                }
            }
        }
        return size;
    }
    
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && vis[i][j]==0){
                    int size = bfs(grid,vis,i,j);
                    ans = Math.max(ans,size);
                }
            }
        }
        return ans;
    }
}