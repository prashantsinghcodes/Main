package dsa.array.easy.promblemsonarray;

public class LinkedList {
    LinkedNode head;

    public void printLinkedList() {
        LinkedNode temp = head;
        while(temp.next != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
}
