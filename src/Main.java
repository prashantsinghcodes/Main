/*
Executing two threads alternatively in Java
Example : Print odd and even numbers alternatively using multiple threading
 */

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for(int i = 1; i <= 5; i++)
            linkedList.add(new Node(i));
        linkedList.print();
        System.out.print("\n" + linkedList.size);
    }
}