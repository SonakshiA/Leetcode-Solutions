class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int number = 1;
        
        int topRow=0, bottomRow=n-1, leftColumn=0, rightColumn=n-1;
        while(topRow<=bottomRow && leftColumn<=rightColumn){
            for(int col=leftColumn;col<=rightColumn;col++){
            res[topRow][col] = number;
            number++;
            }
            topRow++;

            for(int row=topRow;row<=bottomRow;row++){
                res[row][rightColumn] = number;
                number++;
            }
            rightColumn--;

            for(int col=rightColumn;col>=leftColumn;col--){
                res[bottomRow][col]=number;
                number++;
            }
            bottomRow--;

            for(int row=bottomRow; row>=topRow;row--){
                res[row][leftColumn]=number;
                number++;
            }
            leftColumn++;
        }

        return res;
    }
}