/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    ArrayList<Integer> inorder = new ArrayList<>();
    
    public TreeNode createBST(int low, int high){
        while(low<=high){
            int mid = low + (high-low)/2;
            TreeNode root = new TreeNode(inorder.get(mid));
            root.left = createBST(low,mid-1);
            root.right = createBST(mid+1,high);
            return root;
        }
        return null;
    }
    
    public TreeNode sortedListToBST(ListNode head) {
        //create a list
        while(head!=null){
            inorder.add(head.val);
            head=head.next;
        }
        
        return createBST(0,inorder.size()-1);
    }
}