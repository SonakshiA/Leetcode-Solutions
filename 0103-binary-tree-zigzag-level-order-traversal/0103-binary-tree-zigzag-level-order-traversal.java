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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();
        List<List<Integer>> vals = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();

        if(root==null){
            return res;
        }
        
        nodes.add(root);
        while(!nodes.isEmpty()){
            List<Integer> values = new LinkedList<>();
            int n = nodes.size();
            for(int i=0;i<n;i++){
                TreeNode node = nodes.poll();
                values.add(node.val);

                if(node.left!=null){
                    nodes.add(node.left);
                }

                if(node.right!=null){
                    nodes.add(node.right);
                }
            }
           vals.add(values); 
        }
        res.add(vals.get(0));
        for(int i=1;i<vals.size();i++){
            if(i%2==0){
                res.add(vals.get(i));
            }else{
                Collections.reverse(vals.get(i));
                res.add(vals.get(i));
            }
        }
        return res;
    }
}