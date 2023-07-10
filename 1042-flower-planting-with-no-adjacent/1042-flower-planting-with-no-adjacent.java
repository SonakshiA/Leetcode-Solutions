class Solution {
     private boolean isSafe(List<List<Integer>> adj, int[] flowerType, int type,int node){
        for(int it: adj.get(node)){
            if(flowerType[it-1]==type) return false;
        }
        return true;
    }
    
     private boolean solve(int node, List<List<Integer>> adj, int[] flowerType, int n){
        if(node==n+1) return true; //end of nodes reached

        for(int i=1; i<=4; i++){ //4 types of flowers
            if(isSafe(adj,flowerType,i,node)){
                flowerType[node-1] = i;
                if(solve(node+1,adj,flowerType,n)==true) return true;
                flowerType[node-1] = 0; //backtrack
            }
        }
        return false;
    }
    
    
    public int[] gardenNoAdj(int n, int[][] paths) {
         List<List<Integer>> adj = new ArrayList<>();

        for(int i=0; i<=n; i++){
            adj.add(new ArrayList<>());
        }

        //making adjacency list based on 1-indexing
        for(int[] path: paths){
            adj.get(path[0]).add(path[1]);
            adj.get(path[1]).add(path[0]);
        }

        int[] flowerType = new int[n];

        solve(1,adj,flowerType,n);


        System.out.println(adj);
        System.out.println(Arrays.toString(flowerType));
        return flowerType;
    }
}