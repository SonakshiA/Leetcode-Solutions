class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int ind = 0;
        double len = Math.ceil((double) n/2);
        System.out.println(len);
        for(int i=n;i>len;i--){
            res[ind++] = i;
            res[ind++] = -i;
        }
        if(n%2==1){
            res[n-1] = 0;
        }
        return res;
    }
}