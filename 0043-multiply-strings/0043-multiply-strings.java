class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))
            return "0";
        int l1 = num1.length();
        int l2 = num2.length();
        char ch1[] = num1.toCharArray();
        char ch2[] = num2.toCharArray();
        int[] res = new int[l1+l2];
        
        for(int i=l2-1;i>=0;i--){
            for(int j=l1-1;j>=0;j--){
                int prod = (ch1[j]-'0')*(ch2[i]-'0');
                int curr = res[i+j+1] + prod;
                res[i+j+1] = curr%10;
                res[i+j] += curr/10;
            }
        }
        int index=0;
        while(index<res.length && res[index]==0)
            index++;
        
        String ans = "";
        while(index<res.length)
            ans+=String.valueOf(res[index++]);
        return ans;
    }
}