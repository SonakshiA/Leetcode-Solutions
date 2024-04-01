class Solution {
    public boolean isPalindrome(String sub, int start, int end){
        while(start<=end){
            if(sub.charAt(start)!=sub.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
    
    public void f(int index, List<String> ds, List<List<String>> res, String s){
        if(index==s.length()){
            res.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                ds.add(s.substring(index,i+1));
                f(i+1,ds,res,s);
                System.out.println(ds);
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ds = new ArrayList<>();
        f(0,ds,res,s);
        return res;
    }
}