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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> treeOne = new ArrayList<Integer>();
        ArrayList<Integer> treeTwo = new ArrayList<Integer>();
        
        dfs(root1,treeOne);
        dfs(root2,treeTwo);
        
        return treeOne.equals(treeTwo);
    }
    
    private void dfs(TreeNode node, List<Integer> leafValues){
        if(node!=null){
            if(node.left==null && node.right==null){
                leafValues.add(node.val);
            }
            
            if(node.left!=null) dfs(node.left, leafValues);
            if(node.right!=null) dfs(node.right, leafValues);
        }
    }
}