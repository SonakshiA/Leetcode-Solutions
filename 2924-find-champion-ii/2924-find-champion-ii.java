class Solution {
    public int findChampion(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] edge: edges){
            adj.get(edge[1]).add(edge[0]);
        }
        
        int leastIncomingNodes = Integer.MAX_VALUE;
        int countOfLeastIncomingNodes = 0;
        int ansNode = 0;
        
        for(ArrayList<Integer> node: adj){
            if(node.size()<leastIncomingNodes){
                leastIncomingNodes = node.size();
            }
        }
        System.out.println(leastIncomingNodes);
        
        for(int i=0;i<adj.size();i++){
            if(adj.get(i).size()==leastIncomingNodes){
                countOfLeastIncomingNodes++;
                ansNode=i;
            }
        }
        return countOfLeastIncomingNodes>1?-1:ansNode; 
    }
}
/*
 My approach:
 
 The node having least number of incoming edges is the champion node.
 
 Build an adjacency list to track incoming nodes.


*/