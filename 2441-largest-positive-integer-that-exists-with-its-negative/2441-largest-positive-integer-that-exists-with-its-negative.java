class Solution {
    public int findMaxK(int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        
        for(int n:nums){
            l.add(n);
        }
        Collections.sort(l);
        int max = Integer.MIN_VALUE;
        int count=0;
        for(int n:l){
            if(l.contains(n*-1))
                max = Math.max(max,n*-1);
            else
                count++;
        }
        return (count==nums.length)?-1:max;
    }
}