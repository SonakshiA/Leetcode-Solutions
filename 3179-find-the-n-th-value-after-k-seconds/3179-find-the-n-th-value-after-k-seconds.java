class Solution {
    public int valueAfterKSeconds(int n, int k) {
      long[] time = new long[n];
        //initialising
      for(int i=0;i<n;i++){
          time[i] = 1;
      }
        
      while(k>0){
          for(int i=1;i<n;i++){
              time[i] = (time[i-1] + time[i]) % (long) (Math.pow(10,9)+7);
          }
          k--;
      }
      return (int) (time[n-1]% (long) (Math.pow(10,9)+7));
    }
}