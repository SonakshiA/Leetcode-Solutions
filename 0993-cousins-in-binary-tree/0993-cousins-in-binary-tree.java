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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int found = 0;
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            
            if(current == null){
                if (!q.isEmpty()) q.add(null);
                found = 0;
                continue;
            }
            
            if (current.left!=null && (current.left.val == x || current.left.val == y)){
                found ++;
            }
            
            else if (current.right!=null && (current.right.val == x || current.right.val == y)){
                found ++;
            }
            
            if (found == 2) return true;
            
            if(current.left != null) q.add(current.left);
            if(current.right != null) q.add(current.right);
        }
        return false;
    }
}