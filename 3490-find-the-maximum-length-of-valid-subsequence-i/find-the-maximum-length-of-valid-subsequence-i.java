class Solution {
    public int maximumLength(int[] nums) {
        int odd = 0;
        int even= 0;
        int prev = nums[0];
        int alt = 1;

        if(prev%2==1) {
            odd++;
        } else {
            even++;
        }

        for(int i=1;i<nums.length;i++) {
            if(prev%2 != nums[i]%2) {
                alt++;
                prev = nums[i];
            }
            if(nums[i]%2==1) {
                odd++;
            } else {
                even++;
            }
        }
        return Math.max(alt, Math.max(odd,even));
    }
}