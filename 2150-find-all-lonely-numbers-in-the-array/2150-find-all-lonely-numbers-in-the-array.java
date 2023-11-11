class Solution {
    public List<Integer> findLonely(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int num:nums){
            if(map.get(num)>1) continue;
            if(map.get(num+1)== null && map.get(num-1)==null) ans.add(num);
        }
        return ans;
    }
}