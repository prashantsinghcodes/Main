package dsa.array.easy.program3;

import java.util.Arrays;

/*
Shift all zeroes to end of the array
constraint : order to be maintained
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 5};
        method1(arr, arr.length);
        System.out.print(Arrays.toString(arr));
    }

    /*
    if order is not important
     */
    private static void method1(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            if(arr[i] == 0) {
                leftShift(arr, i, n);
            }
        }
    }

    private static void leftShift(int[] arr, int i, int n) {
        for(int j = i; j < n-1; j++) {
            arr[j] = arr[j+1];
        }
        arr[n-1] = 0;
    }
}
