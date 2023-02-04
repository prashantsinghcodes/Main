package linkedlist;

public class CircularLinkedListDemo {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.tail = null;
        cll.insertNode(5, 3);
        /*cll.insertNode(3, 5);
        cll.insertNode(5, 7);
        cll.insertNode(7, 9);
        cll.insertNode(5, 6);
        cll.print();*/
        cll.deleteNode(3);
        cll.print();
    }
}
