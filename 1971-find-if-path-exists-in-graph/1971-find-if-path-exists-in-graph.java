class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        if(source==destination) return true;
        if(destination>n-1) return false;
        
        //create an adjacency list:
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            int[] e = edges[i];
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        
        
        //BFS traversal
        int[] vis = new int[n];
        
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        vis[source]=1;
        
        while(!q.isEmpty()){
            int node = q.poll();
           
            
            for(int nbr: adj.get(node)){
                if(nbr==destination){
                    return true;
                }
                if(vis[nbr]!=1){
                    q.add(nbr);
                    vis[nbr]=1;
                } //not visited so we add it to out queue
            }
        }
        return false;
    }
}
    