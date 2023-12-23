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
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        pascalTriangle(res,numRows);
        return res;
    }
}

