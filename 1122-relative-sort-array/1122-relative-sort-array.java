class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> freq = new LinkedHashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> rem = new ArrayList<>();
        
        for(int x:arr2){
            freq.put(x,0);
        }
        
        for(int x:arr1){
            if(!freq.containsKey(x))
                rem.add(x);
            else
                freq.put(x,freq.get(x)+1);
        }
        
        Collections.sort(rem);
        
        for(int key: freq.keySet()){
            for(int i=0;i<freq.get(key);i++){
                res.add(key);
            }
        }
        for(int i=0;i<rem.size();i++){
            res.add(rem.get(i));
        }
        int[] ans = new int[res.size()];
        for(int i=0;i<res.size();i++)
            ans[i] = res.get(i);
        
        return ans;
    }
}