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
    
    private void preOrder(TreeNode node){
        if(node!=null){
            list.add(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }else{
            return;
        }
    }
    public int getMinimumDifference(TreeNode root) {
        int res = Integer.MAX_VALUE;
        preOrder(root);
        Collections.sort(list);
        
        for(int i = 0; i<list.size()-1;i++){
            if(Math.abs(list.get(i)-list.get(i+1))<res){
                res = Math.abs(list.get(i)-list.get(i+1));
            }
        }
        return res;
    }
}

//Intution: do preOrder traversal and sort the array and iterate thru it