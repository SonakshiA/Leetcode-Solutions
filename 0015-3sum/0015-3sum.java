class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || i > 0 && nums[i - 1] != nums[i]) {
                int low = i + 1;
                int high = nums.length - 1;
                int sum = 0 - nums[i];

                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[low]);
                        temp.add(nums[high]);

                        res.add(temp);

                        while (low < high && nums[low + 1] == nums[low]) low++;
                        while (low < high && nums[high - 1] == nums[high]) high--;

                        low++;
                        high--;
                    } else if (nums[low] + nums[high] < sum) low++;

                    else high--;
                }
            }
        }
        return res;
    }
}