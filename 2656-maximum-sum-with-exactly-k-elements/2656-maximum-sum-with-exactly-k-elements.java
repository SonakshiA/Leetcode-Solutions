class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0 ;
        int max = nums[nums.length-1];
        
        while(k>0){
            System.out.println(max);
            sum += max;
            max+=1;
            k--;
        }
        return sum;
    }
}