class Solution {
    public int[] searchRange(int[] arr, int k) {
        int res[] = {-1,-1};
        if(arr.length==0) return res;
       int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                res[0] = i;
                
                break;
            }
        }  
        
     

        for(int i=n-1;i>=0;i--){
            if(arr[i]==k){
                res[1] = i;
                
                break;
            }
        }

        return res;
    }
}