class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        long[] count = new long[60]; //remainder between 0 and 59
        long ans = 0;
        for(int duration:time){
            count[duration%60]++;
        }
        int i=1, j=59;
        
        while(i<j){
            ans += count[i]*count[j];
            i++;
            j--;
        }
        
        //group 0 and group 30
        ans+= (count[0]*(count[0]-1)/2) + (count[30]*(count[30]-1)/2);
        return (int) ans;
    }
}