import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

class LinkedList {
    Node head;
    void sortedInsert(Node newNode) {
        Node current;
        if (head == null || head.data >= newNode.data) {
            newNode.next = head;
            head = newNode;
        } else {
            current = head;
            while (current.next != null && current.next.data < newNode.data)
                current = current.next;
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    void insertionSort(Node headref) {
        head = null;
        Node sorted = null;
        Node current = headref;
        while (current != null) {
            Node next = current.next;
            sortedInsert(current);
            current = next;
        }
    }

    void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the linked list separated by space. End the list with -1.");
        int data = sc.nextInt();
        while (data != -1) {
            list.push(data);
            data = sc.nextInt();
        }
        sc.close();
        System.out.println("Linked List before Sorting..");
        list.printList(list.head);
        list.insertionSort(list.head);
        System.out.println("\nLinkedList After sorting");
        list.printList(list.head);
    }
}