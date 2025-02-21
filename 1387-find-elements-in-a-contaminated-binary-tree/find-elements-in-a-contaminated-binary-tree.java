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
class FindElements {
    HashSet<Integer> numbers;

    public FindElements(TreeNode root) {
        numbers = new HashSet<>();
        dfs(root,0);

    }
    
    public boolean find(int target) {
        return numbers.contains(target);
    }

    private void dfs(TreeNode currNode, int currValue){
        if(currNode==null){
            return;
        }
        numbers.add(currValue);
        dfs(currNode.left,currValue*2+1);
        dfs(currNode.right,currValue*2+2);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */