class Solution {
    private boolean binarySearch(int[] array, int target){
        int low = 0;
        int high = array.length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(target>array[mid]){
                low = mid+1;
            }else if(target<array[mid]){
                high = mid-1;
            }else if(target==array[mid]){
                return true;
            }
        }
        return false;
    }
    public int search(int[] nums, int target) {
        int[] copy = new int[nums.length];
        
        for(int i=0;i<nums.length;i++){
            copy[i] = nums[i];
        }
        
        Arrays.sort(copy);
        
        if(binarySearch(copy,target)){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==target)
                    return i;
            }
        }
        return -1;
    }
}