package linkedlist;

public class CircularLinkedList {
    public CircularNode tail;

    public void deleteNode(int value) {
        if(tail == null) {
            System.out.print("list is empty, please check again!");
        } else {
            CircularNode prev = tail;
            CircularNode current = prev.next;
            while(current.data != value) {
                prev = current;
                current = current.next;
            }
            prev.next = current.next;
            if(current == prev) {
                tail = null;
            } else if(tail == current) {
                tail = prev;
            }
            current.next = null;
        }
    }

    public void print() {
        CircularNode temp = tail;
        if(tail == null) {
            System.out.print("list is empty");
            return;
        }
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != tail);
        System.out.print("\n");
    }
    public void insertNode(int element, int value) {
        if(tail == null) {
            CircularNode node = new CircularNode(value);
            tail = node;
            node.next = node;
        } else {
            CircularNode node = tail;
            while (node.data != element) {
                node = node.next;
            }
            CircularNode temp = new CircularNode(value);
            temp.next = node.next;
            node.next = temp;
        }
    }
}
