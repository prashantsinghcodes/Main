package dsa.array.easy.promblemsonarray;

import java.sql.PreparedStatement;

public class LinkedListReversal {
    public static void main(String[] args) {
        LinkedList ll1 = new LinkedList();
        LinkedNode node1 = new LinkedNode(1);
        LinkedNode node2 = new LinkedNode(8);
        LinkedNode node3 = new LinkedNode(22);
        LinkedNode node4 = new LinkedNode(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        ll1.head = node1;
        LinkedList ll2 = new LinkedList();
        LinkedNode node5 = new LinkedNode(4);
        LinkedNode node6 = new LinkedNode(11);
        LinkedNode node7 = new LinkedNode(16);
        LinkedNode node8 = new LinkedNode(20);
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        ll2.head = node5;
        ll1.printLinkedList();
        ll2.printLinkedList();
        ll1.head = mergeLists(ll1.head, ll2.head);
        ll1.printLinkedList();
    }

    private static LinkedNode mergeLists(LinkedNode ll1, LinkedNode ll2) {
        if(ll1 == null) return ll2;
        if(ll2 == null) return  ll1;

        if(ll1.value <= ll2.value) {
            ll1.next = mergeLists(ll1.next, ll2);
            return ll1;
        } else {
            ll2.next = mergeLists(ll1, ll2.next);
            return ll2;
        }
    }

    private static LinkedNode reverseList(LinkedNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        LinkedNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

}
