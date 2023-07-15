class Solution {
    public int findKthLargest(int[] nums, int k) {
         int ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        int i=0;
        for(int num: nums){
            pq.add(num);
        }

        while(k>0){
             ans = pq.poll();
            k--;
        }
        return ans;
    }
}