class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum=0;
        int count=0;
        
        Set<Integer> bannedSet = new HashSet<>();
        
        for(int x: banned){
            bannedSet.add(x);
        }
        
        for(int i=1;i<=n;i++){
            if(!bannedSet.contains(i) && (sum+i)<=maxSum){
                count++;
                sum+=i;
            }
        }
        return count;
    }
}