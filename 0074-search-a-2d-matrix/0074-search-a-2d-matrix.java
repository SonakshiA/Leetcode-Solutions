class Solution {
    private boolean binarySearch(int[] array, int target){
        
        int n = array.length;
        int low = 0;
        int high = n-1;
        
        if(target==array[low] || target==array[high])
            return true;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(array[mid]>target){
                high = mid-1;
            }else if(array[mid]<target){
                low = mid+1;
            }else if(array[mid]==target){
                return true;
            }
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row: matrix){
            if (target>= row[0] && target<=row[row.length-1]){
                return binarySearch(row,target);
            }else{
                continue;
            }
        }
        return false;
    }
}