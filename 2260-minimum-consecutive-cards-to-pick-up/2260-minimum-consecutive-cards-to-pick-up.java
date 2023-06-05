class Solution {
    public int minimumCardPickup(int[] cards) {
        int ans = Integer.MAX_VALUE;
        HashMap<Integer, Integer> lastOccurence = new HashMap<>();

        //the idea is to keep track of the last occurence of an element
        for (int i = 0; i < cards.length; ++i) {
            if (lastOccurence.containsKey(cards[i])) {
                ans = Math.min(ans, i - lastOccurence.get(cards[i]) + 1);
            } 
            lastOccurence.put(cards[i], i);
            
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}