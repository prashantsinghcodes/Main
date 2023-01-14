package dsa.array.easy.program5;

import java.util.Arrays;

/*
Rearrange elements of an array in max-min order
Time complexity - O(n^2)
Space complexity - O(1)
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 5, 6, 2};
        Arrays.sort(arr);
        int n = arr.length;
        method1(arr, n);
        for(int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    private static void method1(int[] arr, int n) {
        int i = 0, j = n-1;
        for(i = 0; i <= n-2; i+=2) {
            if(i % 2 == 0) {
                swap(arr, n, i);
                rightShiftByOne(arr, i+1, n-1);
            }
        }
    }

    private static void swap(int[] arr, int n, int i) {
        int temp = arr[i];
        arr[i] = arr[n -1];
        arr[n -1] = temp;
    }

    private static void rightShiftByOne(int[] arr, int start, int end) {
        int temp = arr[end];
        for(int i = end; i > start; i--)
            arr[i] = arr[i-1];
        arr[start] = temp;
    }
}
