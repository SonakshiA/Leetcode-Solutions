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
    List<Integer> res = new ArrayList<>();
    
    public void inorder(TreeNode node){
        if(node!=null){
            inorder(node.left);
            res.add(node.val);
            inorder(node.right);
        }else{
            return;
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }
}
//In inorder traversal, we have Left, Node and Right