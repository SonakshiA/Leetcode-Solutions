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
    ArrayList<Integer> list = new ArrayList<>();
    
    private void preOrder(TreeNode root){
        if(root!=null){
            list.add(root.val);
            preOrder(root.left);
            preOrder(root.right);
        }else{
            return;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        preOrder(root);
        Collections.sort(list);
        System.out.println(list);
        return list.get(k-1);
    }
}