class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length, i = 0;
        if (n % 2 == 1) return new int[0];
        int[] res = new int[n / 2];
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();

        for (int num : changed) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int x : freqMap.keySet()) {
            if (freqMap.get(x) > freqMap.getOrDefault(x + x, 0)) {
                return new int[0];
            }

            for (int j = 0; j < freqMap.get(x); ++j) {
                res[i++] = x;
                freqMap.put(x + x, freqMap.getOrDefault(x + x, 0) - 1);
            }

        }

        return res;
    }
}