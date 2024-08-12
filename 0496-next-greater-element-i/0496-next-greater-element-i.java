class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> m = new HashMap<>();
        
        for(int num:nums2){
            while(!stack.isEmpty() && stack.peek()<num){
                m.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int ans[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i] = m.getOrDefault(nums1[i],-1);
        }
        return ans;
    }
}