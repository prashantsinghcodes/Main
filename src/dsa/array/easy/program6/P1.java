package dsa.array.easy.program6;

import java.util.Arrays;

/*
Segregate the even and odd numbers in an array
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {3, 12, 13, 8, 1, 5, 7};
        method2(arr);
        System.out.print(Arrays.toString(arr));
    }

    /*
    When order is not important
    Time complexity - O(n)
    Space complexity - O(1)
     */
    private static void method1(int[] arr) {
        int evenPosition = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                evenPosition += 1;
                int temp = arr[evenPosition];
                arr[evenPosition] = arr[i];
                arr[i] = temp;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    /*
    When order is important
    Time complexity - O(n^2)
    Space complexity - O(1)
     */
    private static void method2(int[] arr) {
        int evenPosition = -1, n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                evenPosition += 1;
                int temp = arr[evenPosition];
                arr[evenPosition] = arr[i];
                arr[i] = temp;
                rightRotateByOne(arr, evenPosition + 1, i);
            }
        }
    }

    private static void rightRotateByOne(int[] arr, int start, int end) {
        int temp = arr[end];
        for(int i = end; i > start; i--)
            arr[i] = arr[i-1];
        arr[start] = temp;
    }


}
