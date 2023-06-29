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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }


        if(root.left==null && root.right==null){
            return 1;
        }

        if(root.left==null){
            return 1 + minDepth(root.right); //go to right tree
        }

        if(root.right==null){ //go to left tree
            return 1 + minDepth(root.left);
        }

        //if both children are present
        return 1+ Math.min(minDepth(root.left),minDepth(root.right));
    }   
        
}