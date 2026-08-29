class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
       int[] copy = nums.clone();
       Arrays.sort(copy);
       int len = nums.length;
       ArrayList<ArrayList<Integer>> groups = new ArrayList<>();
       HashMap<Integer, Integer> pos = new HashMap<>();
       int id = -1;

       for(int i=0;i<len;i++){
            if(i == 0 || copy[i] - copy[i-1] > limit) {
                groups.add(new ArrayList<Integer>());
                id++;
            }
            groups.get(id).add(copy[i]);
            pos.put(copy[i], id);
        }
        // index for each group
        int[] idx = new int[groups.size()];
        int[] ans = new int[len];

        for(int i=0;i<len;i++){
            // get group
            int grp = pos.get(nums[i]);
            // from that group get the elements in order
            ans[i] = groups.get(grp).get(idx[grp]);
            idx[grp]++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna