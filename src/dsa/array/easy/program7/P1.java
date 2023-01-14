package dsa.array.easy.program7;

import java.util.Arrays;

/*
Reversal algo for array rotation
Time complexity - O(n)
Space complexity - O(1) - Inplace algorithm
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 7, 4, 8};
        reversalAlgo(arr, arr.length, 2);
        System.out.print(Arrays.toString(arr));
    }

    private static void reversalAlgo(int[] arr, int n, int k) {
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
    }
}
