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
    int[] diameter = new int[1];
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter[0];
    }
    
    private int height(TreeNode node){
        if(node==null)
            return 0;
        int lh = height(node.left);
        int rh = height(node.right);
        
        diameter[0] = Math.max(diameter[0],lh+rh);
        return 1 + Math.max(lh,rh);
        
    }
}
/*
At each node, calculate the height of the left subtree and right subtree and sum it up
*/