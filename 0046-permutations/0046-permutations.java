class Solution {
    private void backtracking(int index, List<List<Integer>> res, int[] nums){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i<nums.length; i++){
                ds.add(nums[i]);
            }
            res.add(ds);
            return;
        }
        
        for(int i = index; i<nums.length; i++){
            swap(i,index,nums);
            backtracking(index+1,res,nums);
            swap(i,index,nums); //backtracked, so swap again to get original array
        }
    }
    
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtracking(0,res,nums);
        return res;
    }
}