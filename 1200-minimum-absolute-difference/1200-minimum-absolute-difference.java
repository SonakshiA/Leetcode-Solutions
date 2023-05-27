class Solution {
     private int findMinimumDifference(int[] arr) {
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) < diff) {
                diff = Math.abs(arr[i + 1] - arr[i]);
            }
        }
        return diff;
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff = findMinimumDifference(arr);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i + 1] - arr[i]) == diff) {
                List<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i + 1]);
                res.add(pair);
            }
        }
        return res;
    }
}