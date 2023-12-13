class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] map = new int[100001];
        int flag=0;
        for(int x:nums){
            if(x%2==0){
                map[x]++;
                flag=1;
            }
        }
        if(flag==0) return -1;
        int max=0;
        int maxElement = 0;
        
        for(int i=0;i<100001;i++){
            if(map[i]>max){
                maxElement = i;
                max = map[i];
            }
        }
        return maxElement;
    }
}