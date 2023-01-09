public class LinkedList {
    private Node head;

    public int size;

    public void add(Node node) {
        if(head == null) {
            head = node;
            size++;
            return;
        }
        Node itr = head;
        while(itr.getNext() != null)
            itr = itr.getNext();
        itr.setNext(node);
        size++;
    }

    public void print() {
        Node node = this.head;
        while(node != null) {
            System.out.print(node.getValue() + " ");
            node = node.getNext();
        }
    }
    
}
