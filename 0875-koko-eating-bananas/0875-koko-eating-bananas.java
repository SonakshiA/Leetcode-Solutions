class Solution {
        private boolean speed(int[] piles, int k,int h) {
        int ans = 0;
        for (int i = 0; i < piles.length; i++) {
            ans += Math.ceil((double)piles[i]/(double)k);
        }
        if(ans>h)
            return false;
        return true;
    }
    
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int ans = 0;

        //finding max number of bananas in a pile
        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max)
                max = piles[i];
        }

        //binary search
        int low = 1;
        int high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if(!speed(piles,mid,h)){
                low = mid+1;
            }else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}