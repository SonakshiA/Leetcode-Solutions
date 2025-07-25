class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums) {
            if(num>0){
                set.add(num);
            }
        }

        if(set.isEmpty()) {
            return Arrays.stream(nums).max().getAsInt();
        }

        int ans = 0;
        for(int num: set) {
            ans+=num;
        }
        return ans;
    }
}