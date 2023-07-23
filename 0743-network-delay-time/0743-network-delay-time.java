class Pair{
    int node;
    int time;
    
    public Pair(int first, int sec){
        node = first;
        time = sec;
    }
}

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        int[] timeArray = new int[n+1];
        ArrayList<ArrayList<Pair>> adjList = new ArrayList<>();
        
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }
        
        for(int[] time: times){
            adjList.get(time[0]).add(new Pair(time[1],time[2]));
        }
        for(int i=0; i<=n; i++){
            timeArray[i] = (int) (1e9);
        }
        
        Queue<Pair> q = new LinkedList<>();
        
        timeArray[k] = 0;
        q.add(new Pair(k,0));
        
        while(!q.isEmpty()){
            Pair it = q.poll();
            int node = it.node;
            int time = it.time;
            
            for(Pair iter: adjList.get(node)){
                int adjNode = iter.node;
                int edW = iter.time;
                
                if(edW+time<timeArray[adjNode]){
                    timeArray[adjNode] = edW+time;
                    q.add(new Pair(adjNode, edW+time));
                }
            }
        }
        for(int i=1;i<=n;i++){
            if(timeArray[i]==(int)(1e9))
               return -1;
        }
        int max = 0;
        for(int i=1;i<=n;i++){
            if(timeArray[i]>max)
                max = timeArray[i];
        }
        return max;
    }
}