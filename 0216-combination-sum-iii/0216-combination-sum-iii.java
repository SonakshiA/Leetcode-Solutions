class Solution {
    void findCombinations(int i, int k, int sumTillNow, int n, List<List<Integer>> ans, List<Integer> subseq){
        
        //base cases
        if(k<0) return;
        
        if(sumTillNow==n){
            if(subseq.size()==k)
                ans.add(new ArrayList<>(subseq));
            return;
        }
        
        if(i==10) return;
        
        //pick
        sumTillNow+=i;
        subseq.add(i);
        findCombinations(i+1,k,sumTillNow,n,ans,subseq);
        sumTillNow-=i;
        subseq.remove(subseq.size()-1);
        
        //ignore
        findCombinations(i+1,k,sumTillNow,n,ans,subseq);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> ans = new ArrayList<>();
         List<Integer> ds = new ArrayList<>();
         findCombinations(1,k,0,n,ans,ds);
        
        return ans;
    }
}