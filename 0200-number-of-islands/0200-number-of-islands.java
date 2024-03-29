class Pair{
    int first;
    int second;
    
    public Pair(int f, int s){
        first = f;
        second = s;
    }
}
class Solution {
    public void bfs(char[][] grid, int[][] vis, int startRow, int startCol){
        vis[startRow][startCol] = 1;
        
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(startRow, startCol));
        
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            q.remove();
            
            for(int delRow=-1;delRow<=1;delRow++){
                for(int delCol=-1;delCol<=1;delCol++){

                    if((delRow==-1 && delCol==-1) || (delRow==-1 && delCol==1) || (delRow==1 && delCol==-1) || (delRow==1 && delCol==1))
                        continue;
                    int nRow = delRow + row;
                    int nCol = delCol + col;

                    if(nRow>=0 && nRow<n && nCol>=0 && nCol<m && grid[nRow][nCol]=='1' && vis[nRow][nCol]==0){
                        vis[nRow][nCol] = 1;
                        q.add(new Pair(nRow,nCol));
                    }
                }
            }
        }  
    }
    public int numIslands(char[][] grid) {
        int count=0;
        int[][] vis = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    bfs(grid,vis,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}