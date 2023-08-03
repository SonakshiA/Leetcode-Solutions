class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
         return targetCapacity == 0 ||
                (jug1Capacity+jug2Capacity>=targetCapacity && targetCapacity % gcd(jug1Capacity,jug2Capacity)==0);
    }
     public int gcd(int n1, int n2) {
        if (n2 == 0) return n1;
        return gcd(n2,n1 % n2);
    }
}