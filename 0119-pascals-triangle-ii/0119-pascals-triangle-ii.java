class Solution {
    
    public void pascalTriangle(List<List<Integer>> res, int numRows){
        for(int i=0;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    l.add(1);
                else{
                    l.add(res.get(i-1).get(j-1)+res.get(i-1).get(j));
                }
            }
            res.add(l);
        }
    }
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res = new ArrayList<>();
        pascalTriangle(res, rowIndex+1);
        return res.get(rowIndex);
    }
}