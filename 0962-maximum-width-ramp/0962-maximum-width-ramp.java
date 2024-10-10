class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            if (st.isEmpty() || nums[st.peek()]>nums[i])
                st.push(i);
        }
        int maxWidth = 0;
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                int startIndex = st.pop();
                maxWidth = Math.max(maxWidth, i-startIndex);
            }
            
            if(st.isEmpty())
                break;
        }
        return maxWidth;
    }
}