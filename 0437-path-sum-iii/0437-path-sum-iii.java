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
    public int pathSum(TreeNode root, int targetSum) {
	if (root == null)
		return 0;

	return getCount(root, targetSum)
		 + pathSum(root.left, targetSum)
	 	 + pathSum(root.right, targetSum);
}

private int getCount(TreeNode node, long targetSum) {
	if (node == null)
		return 0;

	targetSum -= node.val;
	var count = getCount(node.left, targetSum)
			  + getCount(node.right, targetSum);

	return targetSum == 0
		 ? count + 1
		 : count;
}
}