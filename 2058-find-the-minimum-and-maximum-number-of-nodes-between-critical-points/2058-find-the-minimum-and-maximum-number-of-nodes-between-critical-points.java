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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> vals = new ArrayList<>();
        while(head!=null){
            vals.add(head.val);
            head=head.next;
        }
        ArrayList<Integer> indices = new ArrayList<>();

        for(int i=1;i<vals.size()-1;i++){
            if(vals.get(i)>vals.get(i-1) && vals.get(i)>vals.get(i+1)){
                indices.add(i);
            }
            else if(vals.get(i)<vals.get(i-1) && vals.get(i)<vals.get(i+1)){
                indices.add(i);
            }
        }
        if (indices.size() < 2){
            return new int[]{-1,-1};
        }
        Collections.sort(indices);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<indices.size();i++) {
            if(indices.get(i)-indices.get(i-1)<min) {
                min=indices.get(i)-indices.get(i-1);
            }
        }
        int max = indices.get(indices.size()-1) - indices.get(0);
        return new int[]{min,max};
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna