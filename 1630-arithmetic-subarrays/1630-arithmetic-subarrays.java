class Solution {
    public boolean check(ArrayList<Integer> l){
        Collections.sort(l);
        if(l.size()>=2){
            int diff = l.get(1) - l.get(0);
            for(int i=1;i<l.size()-1;i++){
                if(l.get(i+1)-l.get(i)!=diff)
                    return false;
            }
        }
        return true;
    }
    
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<l.length;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=l[i];j<=r[i];j++){
                list.add(nums[j]);
            }
            res.add(check(list));
        }
        return res;
    }
}