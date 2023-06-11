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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        
        //adding numbers in nums to a set
        for(int num:nums){
            numbers.add(num);
        }
        
        ListNode current = head;
        int count = 0;
        
        while(current!=null){
            if (numbers.contains(current.val)){
                count += 1;
                while(current.next!=null && numbers.contains(current.next.val)==true){
                    current = current.next;
                }
            }
            current = current.next;
        }
        return count;
    }
}