class Solution {
    public int countServers(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;

        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(grid[row][col]==1){
                    boolean canCommunicate = false;

                    for(int otherCol=0;otherCol<cols;otherCol++){
                        if(otherCol!=col && grid[row][otherCol]==1){
                            canCommunicate = true;
                            break;
                        }
                    }

                    if(canCommunicate){
                        count++;
                    }else{
                        for(int otherRow=0;otherRow<rows;otherRow++){
                            if(otherRow!=row && grid[otherRow][col]==1){
                                canCommunicate=true;
                                break;
                            }
                        }
                        if(canCommunicate){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}