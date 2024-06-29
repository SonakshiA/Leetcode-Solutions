class Solution {
    public boolean checkString(String s) {
        //check if b even exists
        boolean b_exists = false;
        int index_of_first_b = 0;
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                index_of_first_b = i;
                b_exists = true;
                break;
            }
        }
        if(b_exists == false)
            return true;
        
        for(int i=index_of_first_b;i<s.length();i++){
            if(s.charAt(i)=='a')
                return false;
        }
        return true;
    }
}