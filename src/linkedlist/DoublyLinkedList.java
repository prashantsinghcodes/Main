package linkedlist;

public class DoublyLinkedList {
    public DoublyNode head;
    public DoublyNode tail;

    public void print() {
        DoublyNode temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("\n");
    }

    public void deleteNode(int position) {
        if(position == 1) {
            DoublyNode node = head;
            node.next.prev = null;
            head = node.next;
            node.next = null;
        }
        int count = 1;
        DoublyNode current = head, prev = null;
        while(count < position) {
            prev = current;
            current = current.next;
            count++;
        }
        current.prev = null;
        prev.next = current.next;
        if(current.next == null) {
            tail = prev;
        }
        current.next = null;
        if(position == getLength()) {
            tail = prev;
        }
    }

    public void insertAtHead(int d) {
        DoublyNode doublyNode = new DoublyNode(d);
        if(head == null) {
            head = tail = doublyNode;
            return;
        }
        doublyNode.next = head;
        head.prev = doublyNode;
        head = doublyNode;
    }

    public void insertAtTail(int d) {
        DoublyNode doublyNode = new DoublyNode(d);
        if(tail == null) {
            tail = head = doublyNode;
            return;
        }
        tail.next = doublyNode;
        doublyNode.prev = tail;
        tail = doublyNode;
    }

    public void insertAtPosition(int position, int d) {
        if(Math.abs(position - getLength()) >= 2) {
            System.out.println("incorrect position provided!");
            return;
        }
        if(position == 1) {
            insertAtHead(d);
            return;
        }
        DoublyNode temp = head;
        int count = 1;
        while(count < position - 1) {
            temp = temp.next;
            count++;
        }
        if(temp.next == null) {
            insertAtTail(d);
            return;
        }
        DoublyNode node = new DoublyNode(d);
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
    }

    public int getLength() {
        int len = 0;
        DoublyNode temp = head;
        while(temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }
}
