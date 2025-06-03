class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        Deque<Integer> q = new ArrayDeque<>();
        HashSet<Integer> has = new HashSet<>();
        HashSet<Integer> took = new HashSet<>();
        int ans = 0;

        for(int initialBox: initialBoxes) {
            has.add(initialBox);
            if(status[initialBox]==1){
                q.offer(initialBox);
                took.add(initialBox);
                ans += candies[initialBox];
            }
        }

        while(!q.isEmpty()){
            int box = q.poll();
            for(int k: keys[box]) {
                if (status[k] == 0){
                    status[k] = 1; //open the box
                    if(has.contains(k) && !took.contains(k)){
                        q.offer(k);
                        took.add(k);
                        ans += candies[k];
                    }
                }
            }

            for(int b: containedBoxes[box]){
                has.add(b);
                if(status[b] == 1) {
                    q.offer(b);
                    took.add(b);
                    ans += candies[b];
                }
            }
        }
        return ans;
    }
}