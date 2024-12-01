class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        
        while(k!=0){
            int max = Integer.MIN_VALUE;
            int index_of_max = 0;
            for(int i=0;i<gifts.length;i++){
                if(gifts[i]>max){
                    max = gifts[i];
                    index_of_max = i;
                }
            }
            gifts[index_of_max] = (int) (Math.sqrt(max));
            k--;
        }
        
        for(int i=0;i<gifts.length;i++){
            ans+=gifts[i];
        }
        return ans;
    }
}