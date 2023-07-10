class Solution {
    private boolean isPalindrome(String sub ,int start, int end){
        while(start<=end){
            if(sub.charAt(start)!=sub.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
    
    private void findPalindromes(int index, String s,List<String> path, List<List<String>> res ){
        if(index==s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        
        for(int i=index; i<s.length();i++){
            if(isPalindrome(s,index,i)){
                path.add(s.substring(index,i+1));
                findPalindromes(i+1,s,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        findPalindromes(0,s,path,res);
        return res;
        
    }
}