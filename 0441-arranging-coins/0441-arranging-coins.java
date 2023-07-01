class Solution {
    public int arrangeCoins(int n) {
        int row = 0;
        int i = 1;
        while (n > 0) {                //n are the number of coins
            if (n - i >= 0) {
                n = n - i;
                row++;
                i++;
            } else {
                n = 0;
            }
        }
        return row;
    }
}