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
class  LinkedListRandomNode {

    ArrayList<Integer> list = new ArrayList<>();

    public Solution(ListNode head) {

        while(head!=null)
        {
            list.add(head.val);
            head=head.next;
        }
        
    }
    
    public int getRandom() {
    double rand = Math.random()*list.size();
    return list.get((int)rand);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */