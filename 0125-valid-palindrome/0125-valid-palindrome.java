class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i =0 ;i<s.length(); i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z' || s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }else{
                continue;
            }
        }
        String copy = sb.toString();
        String rev = sb.reverse().toString();
        System.out.println(rev);
        return (rev.equals(copy)) ? true: false;
    }
}