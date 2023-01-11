package dsa.array.easy.program1;

/*
Find the largest three elements of a string array
 */

import java.util.*;

public class P2 {
    public static void main(String[] args) {
        String[] arr = {"Ankit", "Prabhat", "Rahul", "Shankar"};
        int n = arr.length;
        method3(arr, n);
    }

    /*
    using java inbuilt function
    Time complexity - O(n * log n)
    Space complexity - O(1) - Inplace algorithm
     */
    private static void method1(String[] arr, int n) {
        Arrays.sort(arr);
        for(int i = n-1; i >= n-3; i--)
            System.out.print(arr[i] + " ");
    }

    /*
    using mergesort
    Time complexity - O(n * log n)
    Space complexity - O(1) - Inplace algorithm
     */
    private static void method2(String[] arr, int left, int right) {
        mergeSort(arr, left, right);
    }

    private static void mergeSort(String[] arr, int left, int right) {
        if(left < right) {
            int mid = left + (right-left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(String[] arr, int left, int mid, int right) {
        int n1 = (mid - left) + 1;
        int n2 = right - mid;
        String[] L = new String[n1];
        String[] R = new String[n2];
        for(int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for(int j = 0; j < n2; j++) {
            R[j] = arr[j + mid + 1];
        }
        int i = 0, j = 0;
        int k = left;
        while(i < n1 && j < n2) {
            if(R[j].compareTo(L[i]) >= 0) {
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }
            k++;
        }

        while(i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    /*
    using java priorityQueue
    Time complexity - O(n * log n)
    Space complexity - O(n) - use of auxiliary space
     */
    private static void method3(String[] arr, int n) {
        List<String> list = Arrays.asList(arr);
        PriorityQueue<String> pq = new PriorityQueue<String>(Collections.reverseOrder());
        pq.addAll(list);
        for(int i = 0; i < 3; i++){
            System.out.print(pq.remove() + " ");
        }
    }
}
