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
    int nodes = 0;
    private void count(TreeNode root, int val){
        if(root!=null){
            if(root.val>=val){
                nodes++;
                val = root.val; //updated val to good node's value
            }
            count(root.left,val);
            count(root.right,val);
        } 
    }
    public int goodNodes(TreeNode root) {
        count(root,root.val);
        return nodes;
    }
}