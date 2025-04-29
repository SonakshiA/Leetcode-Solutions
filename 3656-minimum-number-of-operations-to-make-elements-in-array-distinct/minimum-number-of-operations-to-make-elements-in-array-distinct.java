class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        int end;
        for(end = n-1; end>=0; end--){
            if(!set.contains(nums[end])){
                set.add(nums[end]);
            }else{
                return end/3 + 1;
            }
        }
        return 0;
    }
}