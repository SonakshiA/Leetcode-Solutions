class Solution {
    public String removeOuterParentheses(String s) {
        char[] brackets = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int n = brackets.length-1;
        int cnt = 0;
        for (Character ch: brackets){
            if(ch=='('){
                cnt++;
                if(cnt>1){
                    sb.append(ch);
                }
            }else{
                cnt--;
                if(cnt>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}