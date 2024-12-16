class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
        (a,b) -> {
            int compare = Integer.compare(a[0],b[0]);
            if(compare==0){
                return Integer.compare(a[1],b[1]);
            }
            return compare;
        });
        
        for(int i=0;i<nums.length;i++){
            pq.add(new int[]{nums[i],i});
        }
        
        while(k!=0){
            int[] smallest = pq.poll();
            int num = smallest[0];
            int index = smallest[1];
            
            nums[index] = nums[index]*multiplier;
            pq.add(new int[]{nums[index],index});
            k--;
        }
        return nums;
    }
}