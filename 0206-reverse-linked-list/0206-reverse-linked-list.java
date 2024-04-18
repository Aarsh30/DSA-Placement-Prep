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
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(ListNode curr = head; curr!= null; curr = curr.next)
        {
            arr.add(curr.val);
        }
        
        for(ListNode curr = head; curr!= null; curr = curr.next)
        {
            curr.val = arr.remove(arr.size()-1);
        }
        
        return head;
    }
}