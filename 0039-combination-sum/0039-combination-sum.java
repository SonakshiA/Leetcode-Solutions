class Solution {
    public void function(List<List<Integer>> res, int[] candidates, int target, int index, List<Integer> ds){
       if(index==candidates.length){
           if(target==0){
               res.add(new ArrayList<>(ds));
           }
           return;
       }
        
        if(candidates[index]<=target){
            ds.add(candidates[index]);
            //index instead of index+1 since same number can be chosen unlimited times
            function(res,candidates,target-candidates[index],index,ds);
            ds.remove(ds.size()-1);
        }
        function(res,candidates,target,index+1,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        function(res,candidates,target,0,ds);
        
        return res;
        
    }
}