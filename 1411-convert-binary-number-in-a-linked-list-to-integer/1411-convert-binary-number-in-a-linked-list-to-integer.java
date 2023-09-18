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
            ListNode curr = head;
        int n=-1;
        while(curr!=null)
        {
            n++;
            curr= curr.next;
        }
        ListNode cur = head;
        int sum=0;
        while(cur!=null)
        {
            sum+=cur.val*(Math.pow(2,n--));
            cur=cur.next;
        }
        return sum;      


    }
}