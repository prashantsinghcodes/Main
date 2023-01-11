package dsa.array.easy.program1;

/*
Find the largest three elements of an array
 */

import java.util.*;

public class P1 {

    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 5, 6, 8};
        int n = arr.length;
        method3(arr, n);
    }

    /*
    using java inbuilt library
    Time complexity - O(nlog)
    Space compexity - O(1) - inplace method
     */
    private static void method1() {
        int[] arr = {3, 1, 7, 5, 6, 8};
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = n-1; i >= n-3; i--)
            System.out.print(arr[i] + " ");
    }


    /*
    by not using mergesort and not by any inbuilt java library
    Time complexity - O(n * log n)
    Space complexity - O(1) - inplace algorithm
     */
    private static void method2(int[] arr, int left, int right) {
        mergeSort(arr, left, right);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = left + (right-left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = (mid - left) + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for(int j = 0; j < n2; j++) {
            R[j] = arr[j + mid + 1];
        }
        int i = 0, j = 0;
        int k = left;
        while(i < n1 && j < n2) {
            if(R[j] >= L[i]) {
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
    private static void method3(int[] arr, int n) {
        List<Integer> list = new ArrayList<>();
        for(Integer x : arr) {
            list.add(x);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.addAll(list);
        for(int i = 0; i < 3; i++){
            System.out.print(pq.remove() + " ");
        }
    }
}
