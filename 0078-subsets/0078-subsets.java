class Solution {
    private void findSubsets(int index, int[] nums, List<Integer> ds, List<List<Integer>> res){
        if(index==nums.length){
            res.add(new ArrayList<>(ds));
            return;
        }
        
        ds.add(nums[index]);
        findSubsets(index+1,nums,ds,res);
        ds.remove(ds.size()-1);
        findSubsets(index+1,nums,ds,res);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findSubsets(0,nums,ds,res);
        
        return res;
    }
}