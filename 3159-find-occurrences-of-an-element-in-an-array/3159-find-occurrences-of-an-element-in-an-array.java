class Solution {
    HashMap<Integer,ArrayList<Integer>> lookup = new HashMap<>();
    
    public void createLookUp(int[] nums){
        //store all integers and their indices
        
        for(int i=0;i<nums.length;i++){
            if(!lookup.containsKey(nums[i])){
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
                lookup.put(nums[i],l);
            }
            else{
                ArrayList<Integer> l = lookup.get(nums[i]);
                l.add(i);
                lookup.put(nums[i],l);   
            }
        }
    }
    private void find(int[] queries, int x, int[] ans){
        //find the queries[i]th occurence of x
        for(int i=0;i<queries.length;i++){
            if(!lookup.containsKey(x)){
                ans[i] = -1;
            }else{
                if(lookup.get(x).size()<queries[i]){
                    ans[i] = -1;
                }else{
                    ans[i] = lookup.get(x).get(queries[i]-1);
                }
            }
        }
        
    }
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        createLookUp(nums);
        int[] ans = new int[queries.length];
        find(queries,x,ans);
        System.out.println(lookup);
        return ans;
    }
}