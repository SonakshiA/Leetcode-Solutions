class Solution {
    public long flowerGame(int n, int m) {
        return ((long) n * m)/2;
    }
}

/*

Alice will only win when x+y is odd
> x is odd, y is even. (n/2)*(m/2) satisfy that
> x is even, y is odd.(n/2)*(m/2) satisfy that
(n/2)*(m/2) + (n/2)*(m/2) = (n*m)/2


*/