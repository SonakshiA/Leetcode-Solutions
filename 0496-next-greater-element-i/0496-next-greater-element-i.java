class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] temp = new int[nums2.length];
        
        for(int i=0;i<nums2.length;i++){
            while(stack.size()>0 && nums2[i]>nums2[stack.peek()]){
                temp[stack.peek()] = nums2[i];
                map.put(nums2[stack.peek()],nums2[i]);
                stack.pop();
            }
            stack.push(i);
        }
        
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                ans[i] = map.get(nums1[i]);
            }else{
                ans[i] = -1;
            }
        }
        
        return ans;
    }
}