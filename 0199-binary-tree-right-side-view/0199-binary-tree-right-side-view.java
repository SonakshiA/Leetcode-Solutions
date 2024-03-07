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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        if(root==null) return res;
        nodes.add(root);
        while(!nodes.isEmpty()){
            int n = nodes.size();
            List<Integer> val = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node = nodes.poll();
                val.add(node.val);
                
                if(node.left!=null)
                    nodes.add(node.left);
                if(node.right!=null)
                    nodes.add(node.right);
            }
            temp.add(val);
        }
        for(List<Integer> v:temp){
            res.add(v.get(v.size()-1));
        }
        return res;
    }
}