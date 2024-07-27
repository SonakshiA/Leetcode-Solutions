class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int numbersSeen=0;
        for(int[] row:matrix){
            for(int num:row){
                pq.add(num);
            }
        }
        int x=-1;
        while(k>0){
            x=pq.poll();
            k--;
        }
        return x;
    }
}