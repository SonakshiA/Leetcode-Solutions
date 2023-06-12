class Solution {
    private void backtrack(int[] nums, int index, List<List<Integer>> res) {
        //base case
        if (index == nums.length) {
            ArrayList<Integer> ds = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                ds.add(nums[i]);
            }
            if (!res.contains(ds)) {
                res.add(ds);
            }
        }

        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            backtrack(nums, index + 1, res);
            swap(i, index, nums); //backtrack so restore array at previous level
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;
    }
}