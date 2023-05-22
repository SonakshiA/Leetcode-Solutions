class Solution {
    public double trimMean(int[] arr) {
        int sum = 0;
        int count = 0;

        Arrays.sort(arr);
        int fivePercent = arr.length / 20;
        for (int i = fivePercent; i < arr.length - arr.length / 20; i++) {
            sum += arr[i];
            count++;
        }

        return (double)sum/count;
    }
}