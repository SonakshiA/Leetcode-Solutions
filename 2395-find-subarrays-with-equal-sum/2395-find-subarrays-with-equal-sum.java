class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> sums = new HashSet<>();
        int start = 0;
        
        while(start<nums.length){
            int end = start;
            int sum = 0;
            
            while(end<nums.length){
                sum+=nums[end];
                
                if(end-start+1==2){
                   if(!sums.contains(sum)){
                        sums.add(sum);
                    }else{
                        return true;
                    }    
                }
                end++;
            }
            start++;
        }
        return false;
    }
}