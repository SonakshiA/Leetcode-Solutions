/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode solve(int[] nums, int low, int high){
        if(low<=high){
            int mid = low+(high-low)/2; //done this way to avoid overflow
            TreeNode root = new TreeNode(nums[mid]);
            root.left = solve(nums,low,mid-1);
            root.right = solve(nums,mid+1,high);
            return root;
        }
        return null; //when low>high
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return solve(nums,0,nums.length-1);
    }
}