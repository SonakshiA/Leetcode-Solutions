class Solution {
    public int getLucky(String s, int k) {
        int digits = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<digits;i++){
           sb.append(s.charAt(i)-96);
        }
        String res = sb.toString();
        if(res.length()==1){
            return Character.getNumericValue(res.charAt(0));
        }

        int sum=0;
        while(k-->0){
            sum=0;
            for(int i=0;i<res.length();i++){
                sum+=Character.getNumericValue(res.charAt(i));
            }
            res = String.valueOf(sum);
        }
        return sum;
    }
}