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
    
    private void inOrder(TreeNode node){
        if(node!=null){
            inOrder(node.left);
            vals.add(node.val);
            inOrder(node.right);
        }else{
            return;
        }
    }
    public int minDiffInBST(TreeNode root) {  
        inOrder(root);
        int res = Integer.MAX_VALUE;
        
        for(int i = 0; i<vals.size()-1;i++){
            if(vals.get(i+1)!=vals.get(i)){
                res = Math.min(res,vals.get(i+1)-vals.get(i));
            }
        }
        return res;
    }
}

/*

Inorder Traversal - LNR

12346

*/