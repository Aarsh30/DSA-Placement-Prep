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
    public ListNode partition(ListNode head, int x) {
        
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);
        
        ListNode righttail=right;
        ListNode lefttail=left;
        
        while(head!=null)
        {
            if(head.val<x)
            {
                lefttail.next = head;
                lefttail = lefttail.next;
            }
            else
            {
                righttail.next = head;
                righttail = righttail.next;
            }
            head = head.next;
        }
        
        lefttail.next = right.next;
        righttail.next = null;
        
        return left.next;
        
    }
}