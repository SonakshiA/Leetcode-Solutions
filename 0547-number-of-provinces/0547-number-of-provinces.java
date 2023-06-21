class Solution {
    
    private void dfs(int[][] isConnected, int[] vis, int u, int n){
        vis[u] = 1;
        for(int v = 0; v<n; v++){
            if(isConnected[u][v]==1 && u!=v){
                if(vis[v]!=1){
                    dfs(isConnected,vis,v,n);
                }
            }
        }
    }
    
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int count = 0;
        int[] visited = new int[isConnected.length];
        for(int i = 0; i<n; i++){
            if(visited[i]!=1){
                count++;
                dfs(isConnected,visited,i,n);
            }
        }
        return count;
    }
}