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
class Solution {
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> nums = new ArrayList<>();
        while(head!=null){
            nums.add(head.val);
            head = head.next;
        }
        Deque<Integer> st = new ArrayDeque<>();
        for(int val:nums){
            while(!st.isEmpty() && st.peek()<val){
                st.pop();
            }
            st.push(val);
        }
        ListNode dummy = new ListNode();
        head = dummy;
        while(!st.isEmpty()){
            head.next = new ListNode(st.pollLast());
            head = head.next;
        }
        return dummy.next;
    }
}