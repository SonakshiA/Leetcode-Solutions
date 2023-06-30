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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid = getMiddle(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
    }

    private ListNode merge(ListNode l1, ListNode l2){
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                current.next = l1;
                l1=l1.next;
            }else{
                current.next=l2;
                l2=l2.next;
            }
            current=current.next;
        }
        current.next=(l1!=null)?l1:l2;

        return dummyNode.next;
    }

    private ListNode getMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode mid = slow.next;
        slow.next=null;
        return mid;
    }
}

//uses divide and conquer