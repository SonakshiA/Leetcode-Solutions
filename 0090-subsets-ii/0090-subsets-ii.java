class Solution {
    private void findCombinations(int index, List<Integer> ds, int[] nums, List<List<Integer>> res){
        if(index==nums.length){
            if(!res.contains(ds)){
                res.add(new ArrayList<>(ds));
            }
            return;
        }
        
        ds.add(nums[index]);
        findCombinations(index+1,ds,nums,res);
        ds.remove(ds.size()-1);
        findCombinations(index+1,ds,nums,res);
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        findCombinations(0,ds,nums,res);
        
        return res;
    }
}