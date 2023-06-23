class Solution {
    private void dfs(int[][] image, int sr, int sc, int color, int oldColor){
        if(image[sr][sc]==oldColor){
            image[sr][sc] = color;
        
        if(sr-1>=0) dfs(image,sr-1,sc,color,oldColor);
        
        if(sr+1<image.length) dfs(image,sr+1,sc,color,oldColor);
        
        if(sc-1>=0) dfs(image,sr,sc-1,color,oldColor);
        
        if(sc+1<image[0].length) dfs(image,sr,sc+1,color,oldColor);
        }
        
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        
        if(oldColor!=color){
            dfs(image,sr,sc,color,oldColor);
        }
        return image;
    }
}