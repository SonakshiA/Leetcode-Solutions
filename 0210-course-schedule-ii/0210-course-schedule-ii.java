class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0 ;i<numCourses; i++){
            adj.add(new ArrayList<>());
        }
        
        for(int[] prereq:prerequisites){
            adj.get(prereq[1]).add(prereq[0]);
            indegree[prereq[0]]++;
        }
        
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        for(int i = 0; i<numCourses; i++){
            if(indegree[i]==0)
                q.add(i);
        }
        
        int count = 0;
        while(!q.isEmpty()){
            int node = q.poll();
            q2.add(node);
            count++;
            
            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it]==0)
                    q.add(it);
            }
        }
        
        if(count<numCourses)
            return new int[]{};
        
        int[] res = new int[numCourses];
        
        if(count==numCourses){
            for(int i =0; i<numCourses; i++){
                res[i] = q2.poll();
            }
        }
        
        return res;
        
    }
}