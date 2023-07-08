class Solution {
    private void findCombinations(int index, int target, ArrayList<Integer> l, int[] candidates,List<List<Integer>> ans){
        
        if(index==candidates.length || target==0){
            if(target==0){
                ans.add(new ArrayList<>(l));
            }
            return;
        }
        
        if(candidates[index]<=target){
            l.add(candidates[index]);
            findCombinations(index,target-candidates[index],l,candidates,ans);
            l.remove(l.size()-1);
        }
        findCombinations(index+1,target,l,candidates,ans);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> l = new ArrayList<>();
        findCombinations(0,target,l,candidates,ans);
        
        return ans;
    }
}