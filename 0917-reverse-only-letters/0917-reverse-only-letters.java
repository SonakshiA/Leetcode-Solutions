class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') ||(s.charAt(i)>='A' && s.charAt(i)<='Z')){
                sb.append(st.pop());
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}