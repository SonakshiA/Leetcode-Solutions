class Solution {
    private boolean dfs(int node, int[][] graph, int[] vis,int pathVis[], int[] check){
        
        vis[node] = 1;
        pathVis[node] = 1;
        check[node] = 0;
        
        for(int adjNode: graph[node]){
            if(vis[adjNode]==0){
                if(dfs(adjNode,graph,vis,pathVis,check)==true)
                    return true;
            }else if(pathVis[adjNode]==1)
                return true;
        }
        
        //backtrack if deadend reached (i.e terminal node)
        pathVis[node] = 0;
        check[node] = 1; //this node is safeNode
        return false;
    }
    
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        
        int[] pathVis = new int[n];
        int[] vis = new int[n];
        int[] check = new int[n];
        
        for(int i = 0 ;i<n; i++){
            if(vis[i]==0){
                dfs(i,graph,vis,pathVis,check);
            }
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        
        for(int i = 0; i<check.length; i++){
            if(check[i]==1)
                res.add(i);
        }
        
        return res;
    }
}

/*

Intuition/ Approach:

1. If a node is a part of a cycle, it is not safe 
2. If a node is connected to any node in a cycle, it is not safe either

*/