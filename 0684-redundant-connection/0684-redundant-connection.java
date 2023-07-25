class DisjointSet{
    List<Integer> size = new ArrayList<Integer>();
    List<Integer> parent = new ArrayList<Integer>();
    
    public DisjointSet(int n){
        for(int i=0;i<=n;i++){
            size.add(1);
            parent.add(i);
        }
    }
    
    public int findUParent(int node){
        if(node==parent.get(node))
            return node;
        
        int ulp = findUParent(parent.get(node));
        parent.set(node,ulp);
        return ulp;
    }
    
    public void unionBySize(int u, int v){
        int ulp_u = findUParent(u);
        int ulp_v = findUParent(v);
        
        if(ulp_u==ulp_v) return;
        
        if(size.get(ulp_u)<size.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
            size.set(ulp_v, size.get(ulp_u)+size.get(ulp_v));
        }else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u, size.get(ulp_u)+size.get(ulp_v));
        }
    }
}



class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        DisjointSet ds = new DisjointSet(edges.length);
        int[] res = new int[2];
        for(int[] edge:edges){
            if(ds.findUParent(edge[0])==ds.findUParent(edge[1])){
                res[0] = edge[0];
                res[1] = edge[1];
                return res;
            }
            ds.unionBySize(edge[0],edge[1]);
        }
        return res;
    }
}