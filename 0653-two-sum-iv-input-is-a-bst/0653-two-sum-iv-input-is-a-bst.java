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
    ArrayList<Integer> vals = new ArrayList<Integer>();
    private void inorderTraversal(TreeNode root){
        if(root!=null){
            inorderTraversal(root.left);
            vals.add(root.val);
            inorderTraversal(root.right);
        }
    }
    public boolean findTarget(TreeNode root, int k) {
        inorderTraversal(root);
        
        if(vals.size()<=1)
            return false;
        
        int i =0;
        int j=vals.size()-1;
        
        while(i<j){
            if(vals.get(i)+vals.get(j)==k)
                return true;
            else if(vals.get(i)+vals.get(j)>k){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }
}