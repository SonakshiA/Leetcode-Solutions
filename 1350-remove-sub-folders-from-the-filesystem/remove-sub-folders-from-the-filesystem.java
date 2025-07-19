class Solution {
    public List<String> removeSubfolders(String[] folder) {
        List<String> folders = new ArrayList<>();
        Set<String> folderSet = new HashSet<>(Arrays.asList(folder));
        
        for(String f: folder){
            String prefix = f;
            boolean isSubFolder = false;
            
            while(!prefix.isEmpty()){
                int pos = prefix.lastIndexOf('/');
                if(pos==-1) break;
                
                prefix = prefix.substring(0,pos);
                
                if(folderSet.contains(prefix)){
                    isSubFolder = true;
                    break;
                }
            }
            if(!isSubFolder){
                folders.add(f);
            }
        }
        return folders;
    }
}