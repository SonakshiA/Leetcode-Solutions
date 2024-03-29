class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];
        
        for(int i=0; i<temperatures.length; i++){
            while(stack.size()>0 && temperatures[i]>temperatures[stack.peek()]){
                ans[stack.peek()] = i-stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}