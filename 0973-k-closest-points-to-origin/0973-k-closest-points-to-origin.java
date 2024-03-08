class Solution {
    public int[][] kClosest(int[][] points, int k) {
        HashMap<int[],Integer> distances = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> distances.get(a)-distances.get(b));
        
        for(int[] coordinates: points){
            int distance = (int) (coordinates[0]*coordinates[0] + coordinates[1]*coordinates[1]);
            distances.put(coordinates,distance);
            pq.add(coordinates);
        }
        int[][] res = new int[k][];
        int i=0;
        while(k-->0){
            res[i++] = pq.poll();
        }
        return res;
    }
}