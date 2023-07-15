class Solution {
    public int[][] kClosest(int[][] points, int k) {
         HashMap<int[],Integer> distances = new HashMap<>();
        int[][] res = new int[k][];

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
                (a,b) -> (distances.get(a) - distances.get(b))
        );

        for(int[] point: points){
            int squaredDistance = (int) (Math.pow((0-point[0]),2) + Math.pow((0-point[1]),2));
            distances.put(point,squaredDistance);
            pq.add(point);
        }

        int i=0;
        while(k!=0){
            res[i++] = pq.poll();
            k--;
        }
        return res;
    }
}