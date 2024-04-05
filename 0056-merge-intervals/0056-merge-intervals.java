class Solution {
    public List<List<Integer>> mergeIntervals(int[][] arr){
        int n = arr.length;
        //sort based on start time
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });
            
        List<List<Integer>> ans = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            if(ans.size()==0 || arr[i][0]>ans.get(ans.size()-1).get(1)){
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));
            }else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
            }
        }
        return ans;
    }
    
    public int[][] merge(int[][] intervals) {
       List<List<Integer>> ans = mergeIntervals(intervals);
       int[][] res = new int[ans.size()][2];
        
        for(int i=0;i<ans.size();i++){
            res[i][0] = ans.get(i).get(0);
            res[i][1] = ans.get(i).get(1);
        }
        return res;
    }
}