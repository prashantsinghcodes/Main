package dsa.array.easy.program9;

/*
sort an array containing numbersfrom 1 to n
Time complexity - O(n)
Space complexity - O(1) - Inplace algorithm
 */

import java.util.Arrays;

public class P1 {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 1, 4};
        int i = 0, n = arr.length;

        while(i < n) {
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
