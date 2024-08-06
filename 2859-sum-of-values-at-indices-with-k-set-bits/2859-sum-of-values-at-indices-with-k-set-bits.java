class Solution {
    private int countSetBits(int index){
        int setBits = 0;
        while(index>0){
            int rem = index%2;
            if(rem==1) setBits++;
            index/=2;
        }
        return setBits;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans = 0;
        for(int i=0;i<nums.size();i++){
            if(countSetBits(i)==k){
                ans+=nums.get(i);
            }
        }
        return ans;
    }
}