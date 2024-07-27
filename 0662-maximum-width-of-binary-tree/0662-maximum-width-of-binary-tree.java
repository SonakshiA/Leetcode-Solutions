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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        int ans = 0;
        q.add(new Pair<>(root,0));
        
        while(!q.isEmpty()){
            int n=q.size();
            int mmin = q.peek().getValue(); //position of the front node at current level
            int first=0,last=0;
            
            for(int i=0;i<n;i++){
                int cur_id = q.peek().getValue() - mmin;
                
                TreeNode node = q.peek().getKey();
                q.poll();
                if(i==0){
                    first = cur_id;
                }
                else if(i==n-1){
                    last = cur_id;
                }
                
                if(node.left!=null){
                    q.add(new Pair<>(node.left,cur_id*2+1));
                }
                if(node.right!=null){
                    q.add(new Pair<>(node.right,cur_id*2+2));
                }
            }
            ans = Math.max(ans,last-first+1);
        }
        return ans;
    }
}

//https://takeuforward.org/data-structure/maximum-width-of-a-binary-tree/