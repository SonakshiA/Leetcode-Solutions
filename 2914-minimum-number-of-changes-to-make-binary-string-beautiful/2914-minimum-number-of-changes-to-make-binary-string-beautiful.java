class Solution {
    public int minChanges(String s) {
        int minChanges = 0;
        for(int i=0;i<s.length()-1;){
            if(s.charAt(i)!=s.charAt(i+1))
                minChanges++;
            i=i+2;
        }
        return minChanges;
    }
}