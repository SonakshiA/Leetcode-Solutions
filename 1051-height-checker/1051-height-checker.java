class Solution {
    public int heightChecker(int[] heights) {
        int[] heightsSorted = new int[heights.length];
        
        for(int i = 0; i<heights.length; ++i){
            heightsSorted[i] = heights[i];
        }
        
        Arrays.sort(heightsSorted);
        int count = 0;
        
        for(int i= 0;i<heights.length;i++){
            if(heights[i]!=heightsSorted[i]) count++;
        }
        return count;
    }
}