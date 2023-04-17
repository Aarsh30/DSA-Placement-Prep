import java.util.*;

public class DoublyLinkList
{
Node head, tail;
DoublylinkedList
{
this.head = null;
this.tail = null;
this.length = 0;
}
Class Node
{
    int data;
    Node prev;
    Node next;
    Node(int d)
    {
           this.data = d;

    }
}


    public Node Insertbegin(int data)
    {   
            Node newNode = new Node(data);
            newNode.next = head;
            newNode.prev =null;
            if(head != null)
            {
                head.prev = newNode;

            }

            head = newNode;

    }
    public Node Insertend(int data)
    {




    }
    void deleteFrist(int data)
    {
        if(head==null)return null;
        if(head.next==null){
            return null;
        }    
        else{
            head=head.next;
            head.prev=null;
                return head;
        }


    }

    void deleteLast() {
        tail = tail.prev;
        tail.next = null;
       }
public static void main(String[] args)
{
Node head = new Node(10);
Node temp1 = new Node(20);
Node temp2 = new Node(30);
head.next= temp1;
temp1.prev=head;
temp1.next=temp2;
temp2.prev=temp1;

}
public boolean isEmpty()
{
    return length == 0;
}

}