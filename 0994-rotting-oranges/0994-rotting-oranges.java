class Pair{
    int first;
    int second;
    int time;
    
    public Pair(int first, int second, int time){
        this.first  = first;
        this.second = second;
        this.time = time;
    }
}


class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] visited = new int[n][m];
        Queue<Pair> q = new LinkedList<>();
        
        //storing all initial rotten oranges at 0th second
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++){
                if(grid[i][j]==2){
                    visited[i][j]=2;
                    q.add(new Pair(i,j,0));
                }else{
                    visited[i][j] = 0;
                }
            }
        }
        
        int tm = 0;
        int[] delCol = {0,1,0,-1};
        int[] delRow = {-1,0,1,0};
        
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            int time = q.peek().time;
            tm = Math.max(time,tm);
            q.remove();
            
            for(int i =0; i<4; i++){
                int newRow = row + delRow[i];
                int newCol = col + delCol[i];
                
                if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && visited[newRow][newCol]!=2 &&                          grid[newRow][newCol]==1){
                    q.add(new Pair(newRow,newCol,time+1));
                    visited[newRow][newCol] = 2;
                }
            }
        }
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(visited[i][j]!=2 && grid[i][j]==1){
                    return -1;
                }
            }
        }
        return tm;
    }
}