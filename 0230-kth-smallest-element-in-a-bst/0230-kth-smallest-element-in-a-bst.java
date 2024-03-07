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
    ArrayList<Integer> vals = new ArrayList<>();
    public void preOrder(TreeNode node){
        if(node!=null){
            vals.add(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        preOrder(root);
        Collections.sort(vals);
        return vals.get(k-1);
    }
}