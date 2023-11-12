class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int[] ans = new int[nums.length-k+1]; //there will be  nums.length-k+1 elements in the ans[]
        int[] count = new int [50];
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                count[nums[i]+50]++;
            }if(i-k>=0 && nums[i-k]<0){
                count[nums[i-k]+50]--;
            }if(i+1>=k){
                ans[i-k+1] = XthSmallest(count,x);
            }
        }
        return ans;
    }
    
    public int XthSmallest(int[] count, int x){
        int prefix = 0;
        for(int i=0;i<50;i++){
            prefix+=count[i];
            if(prefix>=x)
                return i-50;
        }
        return 0;
    }
}

//in count[], we store the count of all negatives numbers between -50 and -1 (as mentioned in the //constraints)

//we simply find the sum of all the negatives numbers in XthSmallest function. If sum>=x we return i=50
//(the original negative number)
//else we return 0