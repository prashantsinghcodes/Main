package dsa.array.easy.program13;

import java.util.*;

/*
Print leaders in an array
an element is a leader if all the elements right to this element in array are
smaller that this element
Time complexity - O(n^2 * log n)
Space complexity - O(2*n) - using list and priority queue to get maximum
 */
public class P1 {
    public static void main(String[] args) {
        Integer[] arr ={16, 17, 4, 3, 5, 2};
        int n = arr.length, i;
        List<Integer> list = Arrays.asList(arr);
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(i = 0; i < n-1; i++) {
            pq.addAll(list.subList(i+1, n));
            if(arr[i] > pq.peek())
                System.out.print(arr[i] + " ");
            pq.clear();
        }
        System.out.print(arr[i]);
    }
}
