class Solution {
    public int lastStoneWeight(int[] stones) {
         Arrays.sort(stones);
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());


        for (int stoneWt : stones) {
            pq.add(stoneWt);
        }

        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();

            if(x<y)
                pq.add(y-x);
            else if(x>y)
                pq.add(x-y);
        }

        return (pq.size()==0) ? 0 : pq.poll();
    }
}