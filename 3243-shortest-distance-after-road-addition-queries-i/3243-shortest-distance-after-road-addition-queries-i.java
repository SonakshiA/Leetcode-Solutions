class Solution {
    private int bfs(int n, ArrayList<ArrayList<Integer>> adjList){
        boolean visited[] = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0); //we start from 0
        visited[0] = true;
        int distance = 0; //level-counter
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int currNode = q.poll();
                if(currNode == n-1){
                    return distance;
                }
                
                for(int adjacent: adjList.get(currNode)){
                    if(!visited[adjacent]){
                        visited[adjacent] = true;
                        q.add(adjacent);
                    }
                }
            }
            distance++;
        }
        return distance;
    }
    
    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        
        //create the first adjacency list:
        for(int i=0;i<n-1;i++){
            adjList.get(i).add(i+1);
        }
        
        for(int[] query: queries){
            adjList.get(query[0]).add(query[1]);
            ans.add(bfs(n,adjList));
        }
        int[] final_ans = new int[ans.size()];
        
        for(int i=0;i<ans.size();i++){
            final_ans[i] = ans.get(i);
        }
        return final_ans;
    }
}

/*
Initially:
0 : 1
1 : 2
2 : 3
3 : 4

On adding [2,4]
0 : 1
1 : 2
2 : 3,4
3 : 4

Make a Queue and do BFS, keep track of the levels

Level 0: We add 0 and do BFS
Level 1: We add 1 (adjacent of 0) and do BFS
Level 2: We add 2 (adjacent of 1) and do BFS
Level 3: We add 3 and 4. Here, we get the n-1 node, so we return 3 (the level number)

Similarly, do for all queries
*/