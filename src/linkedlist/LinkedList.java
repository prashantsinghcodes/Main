package linkedlist;

import com.sun.javafx.sg.prism.NGNode;

public class LinkedList {
    Node head, tail;
    public void insertAtHead(int d) {
        Node node = new Node(d);
        node.next = head;
        head = node;
    }

    public void insertAtTail(int d) {
        Node node = new Node(d);
        tail.next = node;
        tail = node;
    }

    public void insertAtPosition(int position, int d) {
        if(position == 1) {
            insertAtHead(d);
            return;
        }
        Node temp = head;
        int count = 1;
        while(count < position - 1) {
            temp = temp.next;
            count++;
        }
        if(temp.next == null) {
            insertAtTail(d);
            return;
        }
        Node node = new Node(d);
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteAtPosition(int position) {
        if(position == 1) {
            Node temp = head;
            head = head.next;
            temp.next = null;
            return;
        } else {
            Node current = head, prev = null;
            int count = 1;
            while(count < position) {
                prev = current;
                current = current.next;
                count++;
            }
            prev.next = current.next;
            if(prev.next == null)
                tail = prev;
            current.next = null;
        }

    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("\n");
    }
}
