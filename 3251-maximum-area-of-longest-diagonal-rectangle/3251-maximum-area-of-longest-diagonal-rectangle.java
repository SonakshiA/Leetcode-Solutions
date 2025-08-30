class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int[] longestDiagnol = new int[2];
        double longestLength = 0;
        int largestArea = 0;
        for(int[] dim:dimensions){
            int length = dim[0];
            int width = dim[1];
            double diagLen = Math.sqrt(length*length +  width*width);
            int area = length*width;
            if(diagLen>longestLength || diagLen== longestLength && area>largestArea){
                longestLength=diagLen;
                largestArea=area;
            }
        }
        return largestArea;
    }
}