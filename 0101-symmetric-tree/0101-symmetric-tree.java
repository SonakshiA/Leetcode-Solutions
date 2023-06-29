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
    private boolean check(TreeNode p, TreeNode q){
        if(p==null && q==null)
            return true;
        
        if(p!=null && q!=null && p.val==q.val)
            return check(p.left,q.right) && check(p.right,q.left);
            
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(check(root.left,root.right))
            return true;
        return false;
    }
}