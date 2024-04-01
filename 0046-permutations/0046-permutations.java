class Solution {
    private void f(int index, int[] nums, List<List<Integer>> res){
        if(index==nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            res.add(ds);
            return;
        }
        
        //swap
        for(int i=index;i<nums.length;i++){
            swap(index,i,nums);
            f(index+1,nums,res);
            swap(index,i,nums);
            //reswap for backtracking
        }
    }
    
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        f(0,nums,res);
        return res;
    }
}