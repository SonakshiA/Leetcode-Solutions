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
    ArrayList<String> vals = new ArrayList<>();
    int res = 0;
    
    private int binary(String s){
        int sum = 0;
        
        for(int i = 0; i<s.length(); i++){
            sum += Character.getNumericValue(s.charAt(i)) * Math.pow(2,s.length()-i-1);
        }
        
        return sum;
    }
    private void dfs(TreeNode node, StringBuilder sb){
        if(node==null){
            return;
        }
        
        sb.append(node.val);
        
        dfs(node.left,sb);
        dfs(node.right,sb);
        
        if(node.left==null && node.right==null){
            res+=binary(sb.toString());
        }
        
        System.out.println(sb.toString());

        
        sb.deleteCharAt(sb.length()-1); //to make 100 to 10 so that it becomes 101 on dfs(node.right,sb)
    }
    
    public int sumRootToLeaf(TreeNode root) {
        dfs(root,new StringBuilder());
        
        return res;
    }
}