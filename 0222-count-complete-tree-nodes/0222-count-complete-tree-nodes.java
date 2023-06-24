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
    int res = 0;
    
    private void preOrder(TreeNode root){
        if(root!=null){
            res++;
            preOrder(root.left);
            preOrder(root.right);
        }else{
            return;
        }
    }
    public int countNodes(TreeNode root) {
        preOrder(root);
        return res;
    }
}