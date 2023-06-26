class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i =0 ;i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        
        // We create this adjacency list by iterating over prerequisites. For every prerequisite in prerequisites, we add an edge from prerequisite[1] to prerequisite[0] and increment the indegree of prerequisite[0] by 1.
        
        for(int[] prerequisite: prerequisites){
            adj.get(prerequisite[1]).add(prerequisite[0]);  //[0 <- 1] i.e 1 comes before 0
            indegree[prerequisite[0]]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0)
                q.add(i);
        }
        
        int cnt = 0;
        
        while(!q.isEmpty()){
            int node = q.peek();
            q.poll();
            cnt++;
            
            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)
                    q.add(it);
            }
        }
        return (cnt==numCourses);
    }
}


/*

if cycle detected, then return false
else return true

Use Kahn's algorithm for cycle detection in a directed graph

*/