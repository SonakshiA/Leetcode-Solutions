class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          int frequentElements[] = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                (n1,n2) -> map.get(n1) - map.get(n2) 
        );

        //comparator: the (a,b) -> map.get(a)-map.get(b) is a lambda function. 
        // Whenever a new element is inserted into the priority queue, that method will be called in order to determine 
        // where in the queue the new element should go.

        for(int num : map.keySet()){
            minHeap.add(num);

            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        for(int i = k - 1; i>=0; i--){
            frequentElements[i] = minHeap.poll();
        }

        return frequentElements;
    }
}