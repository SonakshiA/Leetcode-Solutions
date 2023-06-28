class Tuple{
    int distance;
    int row;
    int col;
    
    public Tuple(int distance, int row, int col){
        this.distance = distance;
        this.row = row;
        this.col = col;
    }
}


class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<Tuple> pq = new PriorityQueue<>((x,y) -> x.distance - y.distance);
        
        int n = heights.length;
        int m = heights[0].length;
        
        int[][] dist = new int[n][m];
        
        //filling all cells with infinity
        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++){
                dist[i][j] = (int)(1e9);
            }
        }
        
        dist[0][0] = 0;
        pq.add(new Tuple(0,0,0));
        int delRow[] = {-1,0,1,0};
        int delCol[] = {0,1,0,-1};
        
        while(!pq.isEmpty()){
            Tuple t = pq.poll();
            int distance = t.distance;
            int row = t.row;
            int col = t.col;
            
            if(row==n-1 && col==m-1) return distance; //destination reached
            
            for(int i =0 ;i<4; i++){
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m){
                    int newEffort = 
                        Math.max(Math.abs(heights[row][col] - heights[nrow][ncol]),distance);
                    
                    if(newEffort<dist[nrow][ncol]){
                        dist[nrow][ncol] = newEffort;
                        pq.add(new Tuple(newEffort,nrow,ncol));
                    }
                }
                
            }
        }
        return 0;
        
    }
}

/* Refer: https://www.youtube.com/watch?v=0ytpZyiZFhA&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=37
*/