class Solution {
    public boolean canReorderDoubled(int[] arr) {
         HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] temp = new Integer[arr.length]; //Comparator interface doesn't work with primitive types

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        //sorting the values based on their abs value without altering the original values
        Arrays.sort(temp, Comparator.comparingInt(Math::abs)); 

        for (int x : temp) {
            if (map.get(x) == 0) continue;

            if (map.getOrDefault(2 * x, 0) <= 0) return false;

            map.put(x, map.get(x) - 1);
            map.put(2 * x, map.getOrDefault(2 * x, 0) - 1);
        }
        return true;
    }
}