class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         Set<List<Integer>> st = new HashSet<>();
        
          for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Set<Long> hashSet = new HashSet<>(); 
                for (int k = j + 1; k < nums.length; k++) {
                    long sum = nums[i] + nums[j]; //to prevent overflow we take long
                   sum += nums[k];
                    long fourth = target - sum;
                    if (hashSet.contains(fourth)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);
                        temp.sort(Integer::compareTo);

                        st.add(temp);
                    }
                    hashSet.add((long) nums[k]);
                }
            }
        }
        return new ArrayList<>(st);
    }
}