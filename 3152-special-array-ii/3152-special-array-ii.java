class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        boolean[] ans = new boolean[queries.length];
        int[] prefix = new int[n];
        prefix[0] = 0;
        
        for(int i=1;i<n;i++){
            if(nums[i]%2 == nums[i-1]%2){
                prefix[i] = prefix[i-1] + 1;
            }else{
                prefix[i] = prefix[i-1];
            }
        }
        
        for(int i=0;i<queries.length;i++){
            int[] q = queries[i];
            int start = q[0];
            int end = q[1];
            
            ans[i] = prefix[end] - prefix[start] == 0;
        }
        return ans;
    }
}

/*
[3,4,2,1,6]

prefix: [0,0,1,1,1]

subquery = [0,4]
prefix[4]-prefix[0] = 1 so false

*/