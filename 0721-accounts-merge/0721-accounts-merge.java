class DisjointSet{
    List<Integer> parent = new ArrayList<>();
    List<Integer> size = new ArrayList<>();
    
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
            size.set(ulp_v,size.get(ulp_u)+size.get(ulp_v));
        }else{
            parent.set(ulp_v,ulp_u);
            size.set(ulp_u,size.get(ulp_u)+size.get(ulp_v));
        }
    }
}



class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String,Integer> mailMap = new HashMap<>();
        int n = accounts.size();
        DisjointSet ds = new DisjointSet(n);
        
        for(int i=0;i<n;i++){
            for(int j=1;j<accounts.get(i).size();j++){
                String mail = accounts.get(i).get(j);
                if(!mailMap.containsKey(mail)){
                    mailMap.put(mail,i);
                }else{
                    ds.unionBySize(i, mailMap.get(mail));
                }
            }
        }
        
        ArrayList<String>[] mergedMails = new ArrayList[n];
        for(int i=0; i<n; i++){
            mergedMails[i] = new ArrayList<String>();
        }
        
        for(Map.Entry<String, Integer> it: mailMap.entrySet()){
            String mail = it.getKey();
            int node = ds.findUParent(it.getValue());
            mergedMails[node].add(mail);
        }
        
         List<List<String>> ans = new ArrayList<>();
        
         for(int i=0; i<n; i++){
            if(mergedMails[i].size()==0) continue;
             Collections.sort(mergedMails[i]);
             List<String> temp = new ArrayList<>();
             temp.add(accounts.get(i).get(0));
             for(String it: mergedMails[i])
                 temp.add(it);
             ans.add(temp);
         }
        return ans;
    }
}



//https://www.youtube.com/watch?v=FMwpt_aQOGw&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=50