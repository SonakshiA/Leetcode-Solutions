class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int n = nums.length;
        for(int num:nums) {
            s.add(num);
        }
        int total = nums[0];

        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]+1){
                total += nums[i];
            } else{
                break;
            }
        }
        while(s.contains(total)){
            total+=1;
        }
        return total;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna