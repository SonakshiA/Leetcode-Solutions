class Solution {
    public int sumCounts(List<Integer> nums) {
        int i = 0, n = nums.size();
        int ans = 0;

        while(i<n) {
            int j = i;
            Set<Integer> unique = new HashSet<>();
            while(j<n){
                if(!unique.contains(nums.get(j))){
                    unique.add(nums.get(j));
                }
                System.out.println(unique.toString());
                ans+= Math.pow(unique.size(),2);
                System.out.println(ans);
                j++;
            }
            i++;
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna