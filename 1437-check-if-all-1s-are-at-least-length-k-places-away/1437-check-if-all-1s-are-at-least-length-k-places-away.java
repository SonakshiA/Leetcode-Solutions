class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> onePosition = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                onePosition.add(i);
            }
        }
        if (onePosition.size()==0) return true;
        int pos = onePosition.get(0);
        for(int i=1;i<onePosition.size();i++){
            if(onePosition.get(i)-pos-1<k){
                return false;
            }
            pos = onePosition.get(i);
        }
        return true;
    }
}