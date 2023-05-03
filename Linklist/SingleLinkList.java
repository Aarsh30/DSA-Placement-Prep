package LinkList;

import java.util.*;

import javax.swing.text.DefaultEditorKit.InsertBreakAction;
public class SingleLinkList{

     Node head;

    class Node
    {
        int data;
        Node next;

        Node(int value)
        {
            data=value;
            next = null;
        }
    }
    public void Insertbegin(int data)
        {
            Node newNode = new Node(data);
            newNode.next=head;
            head=newNode;

    }
    public void Insertlast(int data)
    {
        Node newNode = new Node(data);
       if(head==null)
       {
       newNode=head;
         
      }

      Node current=head;
      while(current.next!=null)
      {
        current=current.next;
      }
        current.next=newNode;
    }
    public 

    public void InsertPos(int pos ,int data)
    {
            Node newNode = new Node(data);
            if(pos==1)
            {
                newNode.next=head;
                head=newNode;
            }

            int count = 1;
            Node previous=head;
            while(count<pos-1)
                {
                    previous=previous.next;
                    
                }
                Node Current = previous.next;
                previous.next=newNode;
                newNode.next=Current;

    }

    public  Node deleteFrist(int data)
    {  
        if(head==null)
        return head;
        
        Node temp = head;
        head=temp.next;
        temp.next=null;
        return temp;
    }

    public Node deleteEnd()
    {
        if(head==null && head.next==null)
        { 
            return head;
        
        }
            Node previous = null;
        Node current = head;
        while(current.next!=null)
        {
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return current;
        
    }

    public Node deletePos(int pos)
    {
        if(pos==1)
        {

            
            head=head.next;
        }
        Node previous=head;
        int count =1;

        while(count<pos -1)
        {
        previous = previous.next;
        count++;
       }
        Node current = previous.next;
        previous.next=current.next;

    }
    public static void main(String[] args)
    {
            SingleLinkList sll = new SingleLinkList();
            sll.head=new Node(1);
            Node two = new Node(2);
            Node three = new Node(3);
            sll.head.next= two;
            sll.head.next = three;
            sll.Insertbegin(20);
            sll.Insertlast(30);
            sll.InsertPos(40,2);
            sll.deleteFrist(0);
    }
}







Node 
