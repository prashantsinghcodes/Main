package linkedlist;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.head = null;
        dll.tail = null;
        dll.print();
        dll.insertAtHead(11);
        dll.print();
        dll.insertAtHead(12);
        dll.print();
        dll.insertAtTail(25);
        dll.print();
        dll.insertAtPosition(3, 55);
        dll.print();
        dll.insertAtPosition(5, 75);
        dll.print();
    }
}
