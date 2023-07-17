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
    
    public ListNode reverseList(ListNode head)
    {
        ListNode prev = null,temp;
        while(head!= null)
        {
            temp= head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
      
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode r1 = reverseList(l1);
         ListNode r2 = reverseList(l2);
        
        
        int totalSum =0, carry =0;
        ListNode ans = new ListNode();
        while(r1!=null || r2!=null)
        {
            if(r1!=null) totalSum+=r1.val;
            if(r2!=null) totalSum+=r2.val;
            
            ans.val = totalSum%10;
            carry = totalSum/10;
            ListNode head = new ListNode(carry);
            head.next = ans;
            ans = head;
            totalSum = carry;
        
        r1=r1!= null ?r1.next : null;
        r2=r2!=null ? r2.next : null;    
        
        }

        return carry ==0 ? ans.next:ans;
    }
}