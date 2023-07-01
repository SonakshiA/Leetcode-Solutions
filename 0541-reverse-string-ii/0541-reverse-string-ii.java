class Solution {
        public String reverseStr(String s, int k) {
        StringBuilder res = new StringBuilder(s);
        int i=0;
        while(i<s.length()){
            int left = i;
            int right = Math.min(i+k-1,s.length()-1); //to check if k characters are present or not
            while(left<right){
                char a = res.charAt(left);
                char b = res.charAt(right);
                res.setCharAt(left,b);
                res.setCharAt(right,a);
                left++;
                right--;
            }
            i = i + 2*k;
        }
        return res.toString();
    }
}