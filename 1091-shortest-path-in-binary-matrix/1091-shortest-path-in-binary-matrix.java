class Tuple{
    int cellCount;
    int row;
    int col;
    
    public Tuple(int first, int sec, int third){
        cellCount = first;
        row = sec;
        col = third;
    }
}


class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] vis = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                vis[i][j] = (int) (1e9);
            }
        }
        Queue<Tuple> q = new LinkedList<>();
        
        if(grid[0][0]==1 || grid[n-1][m-1] ==1) return -1;
        
        vis[0][0] = 1;
        q.add(new Tuple(1,0,0));
        grid[0][0] = 1;
        
        while(!q.isEmpty()){
            Tuple t = q.poll();
            int cellCount = t.cellCount;
            int row = t.row;
            int col = t.col;
            System.out.println(cellCount + " " + row + " " + col);
            
            if(row==n-1 && col==m-1) return vis[n-1][m-1];
            
            for(int delRow = -1; delRow<=1; delRow++){
                for(int delCol=-1; delCol<=1; delCol++){
                    int nRow = row+delRow;
                    int nCol = col+delCol;
                    
                    if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && grid[nRow][nCol]==0){
                        if(cellCount+1<vis[nRow][nCol]){
                            vis[nRow][nCol] = cellCount+1;
                            grid[nRow][nCol] = 1;
                            q.add(new Tuple(cellCount+1,nRow,nCol));
                        }
                    }
                }
            }
        }
        return -1;
    }
}