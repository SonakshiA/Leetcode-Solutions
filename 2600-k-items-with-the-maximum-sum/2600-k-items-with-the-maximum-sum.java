class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int ans = 0;
        ArrayList<Integer> list = new ArrayList<>();

        //start populating the array with 1s

        for (int i = 0; i < numOnes; i++) {
            list.add(1);
        }

        for (int i = 0; i < numZeros; i++) {
            list.add(0);
        }

        for (int i = 0; i < numNegOnes; i++) {
            list.add(-1);
        }

        for (int i = 0; i < k; i++) {
            ans += list.get(i);
        }
        //System.out.println(list);
        return ans;
    }
}