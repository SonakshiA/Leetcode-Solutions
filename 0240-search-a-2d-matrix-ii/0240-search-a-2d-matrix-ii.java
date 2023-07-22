class Solution {
    private boolean binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]>target){
                high = mid-1;
            }else if(arr[mid]<target){
                low = mid+1;
            }else if(arr[mid]==target){
                return true;
            }
        }
        return false;
    }
    
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] arr: matrix){
            if(arr[0]<=target && arr[arr.length-1]>=target){
                if(binarySearch(arr,target))
                    return true;
            }
        }
        return false;
    }
}