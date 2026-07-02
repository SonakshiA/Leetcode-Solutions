class Solution {
    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] dis = new int[m][n]; // minimum cost to reach
        for (int i = 0; i < m; i++) {
            Arrays.fill(dis[i], -1);
        }

        int[][] dirs = {{0,1}, {1,0}, {0,-1},{-1,0}};

        // store [cost, row, col]
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            Comparator.comparingInt(a -> a[0])
        );

        pq.offer(new int[] {grid.get(0).get(0), 0 ,0});

        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int val = curr[0];
            int cx = curr[1];
            int cy = curr[2];

            if(dis[cx][cy] >= 0) {
                continue;
            }
            dis[cx][cy] = val;
            for(int[] d: dirs) {
                int nx = cx + d[0];
                int ny = cy + d[1];

                if(nx<0 || ny<0 || nx>=m || ny>=n) {
                    continue;
                }

                if(dis[nx][ny]>=0) {
                    continue;
                }
                pq.offer(new int[] {val + grid.get(nx).get(ny),nx,ny});
            }
        }
        return dis[m - 1][n - 1] < health;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna