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
    private int goodNodes(TreeNode node, int max){
        if(node==null)
            return 0;
        int newMax = Math.max(max,node.val);
        return (node.val>=max ? 1 : 0) + goodNodes(node.left,newMax) + goodNodes(node.right, newMax);
    }
    public int goodNodes(TreeNode root) {
        return goodNodes(root,root.val);
    }
}