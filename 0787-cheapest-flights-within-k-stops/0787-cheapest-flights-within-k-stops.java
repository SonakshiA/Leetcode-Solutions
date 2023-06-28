class Pair{
    int first;
    int second;
    
    public Pair(int first, int second){
        this.first = first;
        this.second = second;
    }
}

class Tuple{
    int first;
    int second;
    int third;
    
     public Tuple(int first, int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    
}



class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        //creating adjacency list
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        
        //4 cities
        for(int i =0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        
        int m = flights.length;
        
        for(int i =0; i<m; i++){
            adj.get(flights[i][0]).add(new Pair(flights[i][1],flights[i][2]));
        }
        
        Queue<Tuple> q = new LinkedList<>();
        int[] dist = new int[n];
        
        for(int i =0; i<n; i++){
            dist[i] = (int) (1e9);
        }
        
        dist[src] = 0;
        q.add(new Tuple(0,src,0)); //stops, node, cost
        
        while(!q.isEmpty()){
            Tuple it = q.poll();
            int stops = it.first;
            int node = it.second;
            int cost = it.third;
            
            if(stops>k) continue; //dont stop
            
            for(Pair iter: adj.get(node)){
                int adjNode = iter.first;
                int edW = iter.second;
                
                if(cost+edW<dist[adjNode] && stops<=k){
                    dist[adjNode] = cost+edW;
                    q.add(new Tuple(stops+1,adjNode,cost+edW));
                }
            }
        }
        if(dist[dst]==(int)(1e9)) return -1;
        else return dist[dst];
        
    }
}

/* Refer: https://www.youtube.com/watch?v=9XybHVqTHcQ&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=38
*/

//sort queue on basis of stops