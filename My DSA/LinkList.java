class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data=x;
        next = null;
    }
}

public class LinkList
{
    public static void main(String[] args)
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        printList(head);
        insertBegin(head, 50);
        System.out.println();
        printList(head);
    } 
    static Node insertBegin(Node head, int x)
    {
        Node temp = new Node(x);
      temp.next = head;
      return temp;
    }
  
    static void printList(Node head)
    {
        Node curr = head;
        while(curr != null)
            {
                System.out.print(curr.data +" ");
                curr= curr.next;
            }
    }
}