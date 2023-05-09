class Solution {
    public String licenseKeyFormatting(String s, int k) {
               StringBuilder ans = new StringBuilder();
       int count = 0, n = s.length();

       char c;
       for(int i = n-1; i>=0; i--){
           c = s.charAt(i);
           if(c!='-'){
               if(count==k){
                   ans.append('-');
                   count = 0;
               }
               count++;

               if(c>='a' && c<='z'){
                   c = (char) (c-32);
               }
               ans.append(c);
           }
       }
       return ans.reverse().toString();
    }
}