class Solution {
    public int minimumCost(int[] cost) {
        int ans = 0;
        Arrays.sort(cost);
        int counter = 0;

        for (int i = cost.length - 1; i >= 0; --i) {
            counter++;
            if (counter%3!=0){
                ans+= cost[i];
            }
        }

        return ans;
    }
}