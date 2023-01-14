package dsa.array.easy.program8;

import java.util.Arrays;

/*
Sort array in wave form
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {10, 90, 49, 2, 1, 5, 23};
        sortInWaveFormMethod2(arr, arr.length);
        System.out.print(Arrays.toString(arr));
    }

    private static void sortInWaveFormMethod1(int[] arr, int n) {
        int remainder = 0;
        for(int i = 0; i < n-1; i++) {
            remainder = (i + 1) % 2;
            if((remainder == 0 && arr[i] > arr[i+1]) || (remainder != 0 && arr[i] < arr[i+1])) {
                swap(arr, i);
            }
        }
    }

    private static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

    /*
    Time complexity - O(n * log n)
    Space complexity - O(1) - Inplace algorithm
     */
    private static void sortInWaveFormMethod2(int[] arr, int n) {
        Arrays.sort(arr);
        for(int i = 0; i <= n-2; i+=2)
            swap(arr, i);
    }

}
