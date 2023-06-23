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
    int res = 0;
    
    private void dfs(TreeNode node, StringBuilder sb){
        if(node==null)
            return;
        
        sb.append(node.val);
        System.out.println(sb.toString());
        
        dfs(node.left,sb);
        dfs(node.right,sb);
        
        if(node.left==null && node.right==null){
             res+=Integer.parseInt(sb.toString());
        }
        
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
        
    }
    
    public int sumNumbers(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfs(root,sb);
        
        return res;
    }
}