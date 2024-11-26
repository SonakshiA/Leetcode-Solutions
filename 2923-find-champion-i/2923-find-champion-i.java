class Solution {
    public int findChampion(int[][] grid) {
        int teams = grid[0].length;
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<teams;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<teams;j++){
                if(grid[i][j]==1){
                    adj.get(j).add(i);
                }
            }
        }
        int minSize = Integer.MAX_VALUE;
        int winner = 0;
        System.out.println(adj);
        
        for(int i=0;i<adj.size();i++){
            if(adj.get(i).size()<minSize){
                minSize = adj.get(i).size();
                winner = i;
            }
        }
        return winner;
    }
}

/*

grid[i][j]=1 => team i is stronger than team j

[[0,1][0,0]] :
grid[0][1] is 1 so team 0 is stronger than team 1

[[0,0,1],[1,0,1],[0,0,0]]

grid[0][2] = team 0 is stronger than team 2
grid[1][0] = team 1 is stronger than team 0
grid[1][2] = team 1 is stronger than team 2



*/