package linkedlist;

public class LinkedListDemo {



    public static void main(String[] args) {
        Node node1 = new Node(10);
        LinkedList ll = new LinkedList();
        ll.head = ll.tail = node1;
        ll.print();
        ll.insertAtTail(12);
        ll.print();
        ll.insertAtTail(15);
        ll.print();
        ll.insertAtPosition(4, 22);
        ll.print();
        ll.deleteAtPosition(3);
        ll.print();
        System.out.print("tail : " + ll.tail.data);
    }
}
