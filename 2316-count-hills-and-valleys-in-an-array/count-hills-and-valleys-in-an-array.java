class Solution {
    public int countHillValley(int[] nums) {

        //remove duplicates
        List<Integer> filtered = new ArrayList<>();
        filtered.add(nums[0]);
        for(int i=1; i<nums.length;i++) {
            if(nums[i-1]!=nums[i])
                filtered.add(nums[i]);
        }

        int ans = 0;
        for(int i=1;i<filtered.size()-1;i++) {
            if(filtered.get(i)>filtered.get(i-1) 
            && filtered.get(i)>filtered.get(i+1))
                ans++;
            else if (filtered.get(i)<filtered.get(i-1)
             && filtered.get(i)<filtered.get(i+1))
                ans++;
        }
        return ans;
    }
}