class Solution {
    private void reverseArray(int[] arr){
        int len = arr.length;
        
        for(int i=0;i<len/2;i++){
            int temp = arr[i];
            arr[i] = arr[len-i-1];
            arr[len-i-1] = temp;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row: image){
            reverseArray(row);
        }
        
        for(int[] row: image){
            for(int i=0;i<row.length;i++){
                if(row[i]==0)
                    row[i]=1;
                else
                    row[i]=0;
            }
        }
        return image;
    }
}