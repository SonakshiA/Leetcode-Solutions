class Solution {
    public boolean checkValid(int[][] matrix) {

        for(int i=0;i<matrix.length;i++){
            Set<Integer> row = new HashSet<>();
            for(int j=0;j<matrix.length;j++){
                row.add(matrix[i][j]);
            }
            if(row.size()<matrix.length) return false;
        }

        for(int j=0;j<matrix.length;j++){
            Set<Integer> col = new HashSet<>();
            for(int i=0;i<matrix.length;i++){
                col.add(matrix[i][j]);
            }
            if(col.size()<matrix.length) return false;
        }
        return true;
    }
}