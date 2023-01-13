package dsa.array.easy.program4;

import java.util.Arrays;

/*
Rearrange elements of an array in such a way that
even positioned elements are greater than odd-positioned elements.
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 2, 8, 9};
        method1(arr, arr.length);
        System.out.print(Arrays.toString(arr));
    }

    /*
    Time complexity - O(n)
    Space complexity - O(1) - inplace algorithm
     */
    private static void method1(int[] arr, int n) {
        int reminder = 0;
        for(int i = 0; i < n-1; i++) {
            reminder = (i + 1) % 2;
            if(reminder == 0 && (arr[i] < arr[i+1])) {
                swap(arr, i);
            } else if(reminder != 0 && (arr[i] > arr[i+1])) {
                swap(arr, i);
            }
        }
    }

    private static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i +1];
        arr[i +1] = temp;
    }
}
