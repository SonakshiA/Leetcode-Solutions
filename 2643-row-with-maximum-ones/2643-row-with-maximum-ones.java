class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxCounts = 0;
        int rowNo = -1;
        int rowRes = 0;
        for(int[] row:mat){
            rowNo++;
            int count = 0;
            for(int x:row){
                if(x==1)
                    count++;
            }
            if(count>maxCounts){
                maxCounts = count;
                rowRes = rowNo;
            }
        }
        return new int[]{rowRes,maxCounts};
    }
}