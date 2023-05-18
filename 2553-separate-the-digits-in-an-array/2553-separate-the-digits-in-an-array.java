class Solution {
     ArrayList<Integer> res = new ArrayList<Integer>();
    
    public void findRemainder(int n){
        ArrayList<Integer> tempRes = new ArrayList<Integer>();
        while(n>0){
            int rem = n%10;
            tempRes.add(rem);
            n/=10;
        }
        Collections.reverse(tempRes);
        for(int num: tempRes){
            res.add(num);
        }
    }
    
    public int[] separateDigits(int[] nums) {
        for(int num:nums){
            findRemainder(num);
        }
        int[] finalRes = new int[res.size()];
        for(int i = 0; i< res.size(); i++){
            finalRes[i] = res.get(i);
        }

        return finalRes;
    }
}