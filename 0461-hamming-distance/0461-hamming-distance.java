class Solution {
    public int hammingDistance(int x, int y) {
         int count = 0;

        int num = x^y;

        System.out.println(num);

        while(num>0){
            count+= (num&1);

            num = num>>1;
        }

        return count;
    }
}