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
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> vals = new ArrayList<>();

        //store values in a list
        while(head!=null) {
            int value = head.val;
            vals.add(value);
            head = head.next;
        }

        int pow = vals.size() - 1;
        int ans = 0;

        for(int i=0; i<vals.size(); i++){
            ans += vals.get(i) * Math.pow(2,pow);
            pow--;
        }
        return ans;
    }
}