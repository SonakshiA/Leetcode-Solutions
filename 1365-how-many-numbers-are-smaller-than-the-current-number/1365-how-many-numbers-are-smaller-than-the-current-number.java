class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int[] count = new int[101];
        int[] prefix_array = new int[101];
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; ++i) {
            count[nums[i]]++;
        }
        

        prefix_array[0] = 0;
        for (int i = 1; i < 101; i++) {
            prefix_array[i] = prefix_array[i - 1] + count[i - 1];
        }

        for (int i = 0; i < nums.length; i++){
            res[i] = prefix_array[nums[i]];
            System.out.println(res[i]);
        }
        return  res;
    }
}