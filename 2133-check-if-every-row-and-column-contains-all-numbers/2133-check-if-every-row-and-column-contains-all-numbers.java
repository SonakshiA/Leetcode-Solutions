class Solution {
    public boolean checkValid(int[][] matrix) {
        Set<Integer> referenceSet = new HashSet<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=1;i<=n;i++) referenceSet.add(i);
        
        for(int[] row:matrix){
            Set<Integer> set = new HashSet<>();
            for(int x:row){
                set.add(x);
            }
            if(!set.equals(referenceSet)) return false;
        }
        
       for(int j=0;j<m;j++){
           Set<Integer> set = new HashSet<>();
           for(int i=0;i<n;i++){
               set.add(matrix[i][j]);
           }
           if(!set.equals(referenceSet)) return false;
       }
        return true;
    }
}