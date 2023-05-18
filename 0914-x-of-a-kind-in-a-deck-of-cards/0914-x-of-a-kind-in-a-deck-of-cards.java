class Solution {
    public int gcd(int a, int b) {
        return b > 0 ? gcd(b, a % b) : a;
    }

    public boolean hasGroupsSizeX(int[] deck) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : deck) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int val : map.values()) {
            res = gcd(val, res);
        }

        return res > 1;
    }
}