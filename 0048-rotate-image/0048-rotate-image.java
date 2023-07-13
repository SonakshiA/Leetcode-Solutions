class Solution {
    public void rotate(int[][] matrix) {
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        
        for(int i =0; i<matrix.length; i++){
            temp.add(new ArrayList<>());
        }
        
        for(int j=0;j<matrix[0].length;j++){
            for(int i =0; i<matrix.length;i++){
                temp.get(j).add(matrix[i][j]);
            }
            Collections.reverse(temp.get(j));
        }
        
            System.out.println(temp);
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j] = temp.get(i).get(j);
            }
        }
    }
}