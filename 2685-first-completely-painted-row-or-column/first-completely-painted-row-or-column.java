class Solution {
    boolean checkRow(int row, int[][] mat){
        for(int col=0;col<mat[0].length;col++){
            if(mat[row][col]>0){
                return false;
            }
        }
        return true;
    }

    boolean checkCol(int col, int[][] mat){
        for(int row=0;row<mat.length;row++){
            if(mat[row][col]>0){
                return false;
            }
        }
        return true;
    }
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int numRows = mat.length;
        int numCols = mat[0].length;
        int[] rowCount = new int[numRows];
        int[] colCount = new int[numCols];

        HashMap<Integer,Pair<Integer,Integer>> posOfNums = new HashMap<>();

        for(int row=0;row<numRows;row++){
            for(int col=0;col<numCols;col++){
                int value = mat[row][col];
                posOfNums.put(value,new Pair(row,col));
            }
        }

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            Pair<Integer,Integer> pos = posOfNums.get(num);
            int row = pos.getKey();
            int col = pos.getValue();
            rowCount[row]++;
            colCount[col]++;

            if(rowCount[row]==numCols||colCount[col]==numRows){
                return i;
            }
        }
        return -1;
    }
}