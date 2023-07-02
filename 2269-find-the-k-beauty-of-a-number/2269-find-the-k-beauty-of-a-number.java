class Solution {
    public int divisorSubstrings(int num, int k) {
        String numVal = String.valueOf(num);
        
        int k_beauty = 0;
        int start = 0;
        while(start+k-1<numVal.length()){
            String subs = numVal.substring(start,start+k);
            int val = Integer.parseInt(subs);
            if(val!=0 && num%val==0)
                k_beauty++;
            start++;
        }
        return k_beauty;
    }
}