class Solution {
    public void findMax(int[][] matrix, int[] maxInCol){
        for(int i=0;i<matrix[0].length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]>max)
                    max=matrix[j][i];
            }
            maxInCol[i] = max;
        }
    }
    
    public void findMin(int[][] matrix, int[] minInRow){
        for(int i=0;i<matrix.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                }
            }
            minInRow[i] = min;
        }
    }
    public List<Integer> luckyNumbers (int[][] matrix) {
        int[] maxInCol = new int[matrix[0].length];
        int[] minInRow = new int[matrix.length];
        
        findMax(matrix,maxInCol);
        findMin(matrix,minInRow);
        
        ArrayList<Integer> l = new ArrayList<>();
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(maxInCol[j]==minInRow[i]){
                    l.add(minInRow[i]);
                }
            }
        }
        return l;
    }
}