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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        if(root==null) return res;
        nodes.add(root);
        while(!nodes.isEmpty()){
            List<Integer> vals = new ArrayList<>();
            int n = nodes.size();
            for(int i=0;i<n;i++){
                          TreeNode node = nodes.poll();
            vals.add(node.val);
            
            if(node.left!=null)
                nodes.add(node.left);
            if(node.right!=null)
                nodes.add(node.right);
            }
            res.add(vals);
        }
        return res;
    }
}