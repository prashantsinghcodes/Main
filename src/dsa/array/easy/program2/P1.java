package dsa.array.easy.program2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/*
Finding second largest element in an array
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 7, 6, 9};
        System.out.print(method3(arr, arr.length));
    }

    private static int method1(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n-2];
    }

    private static void method2(Integer[] arr, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(arr));
        int count = 0;
        for(int i = 0; i <= 1; i++, count++) {
            if(count == 1) {
                System.out.print(pq.remove());
                break;
            }
            pq.remove();
        }
    }

    private static int method3(int[] arr, int n) {
        int largest = arr[0], secondLargest = arr[0];
        for(int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        return secondLargest;
    }
}
