import java.util.TreeMap;

class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
        int m = items.length, n=queries.length;
        
        Arrays.sort(items, (a,b) -> a[0]-b[0]);
        
        int max = 0;
        
        for(int i=0;i<m;i++){
            if(items[i][1]>max){
                max =items[i][1];
            }
            map.put(items[i][0], max);
        }
        
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = map.floorKey(queries[i])==null?0:map.get(map.floorKey(queries[i]));
        }
        return ans;
    }
}