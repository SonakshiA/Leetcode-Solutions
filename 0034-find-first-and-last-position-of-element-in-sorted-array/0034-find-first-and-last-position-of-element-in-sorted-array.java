class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = {-1,-1};
        
        if(nums.length==0){
            return res;
        }
        
        int front = 0;
        int back = nums.length-1;
        
        while(front<=back){
            if(nums[front]==target && nums[back]==target){
                res[0] = front;
                res[1] = back;
                break;
            }
            
            if(nums[front]==target){
                res[0] = front;
            } 
            else{
                System.out.println("Here");
                front++;
            }
            
            if(nums[back]==target){
                res[1] = back;
            }else{
                back--;
            }
        }
        return res;
    }
}