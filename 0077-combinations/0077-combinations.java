class Solution {
    private void findCombinations(int[] arr, int index, List<Integer> l, List<List<Integer>> res, int k){
        if(l.size()==k){
            res.add(new ArrayList<>(l));
            return;
        }
        
        if(index<arr.length){
            l.add(arr[index]);
            findCombinations(arr,index+1,l,res,k);
            l.remove(l.size()-1);
            findCombinations(arr,index+1,l,res,k);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l= new ArrayList<>();
        
        int[] arr = new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1] = i;
        }
        System.out.println(Arrays.toString(arr));
        findCombinations(arr,0,l,res,k);
        return res;
    }
}