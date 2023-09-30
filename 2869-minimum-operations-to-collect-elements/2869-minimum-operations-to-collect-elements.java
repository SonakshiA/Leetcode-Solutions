class Solution {
    boolean check(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
    }
    public int minOperations(List<Integer> nums, int k) {
        int[] arr = new int[k+1];
        int moves = 0;
        int last = nums.size()-1;
        while(last>=0){
            if(nums.get(last)<=k){
                arr[nums.get(last)] = 1;
                moves++;
                if(check(arr))
                    return moves;
                last--;
            }else{
                moves++;
                last--;
            }
        }
        return moves;
    }
}