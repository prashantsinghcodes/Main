package dsa.array.easy.promblemsonarray;

import java.util.Arrays;
import java.util.HashMap;

/*
 Check if two arrays are equal using sorting

 */
public class P2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};
        if(areEqualBySorting(arr1, arr2))
            System.out.print("Yes");
        else
            System.out.print("No");
    }

    /*
    Check if two arrays are equal using sorting
    Time complexity - O(n * log n)
    Space complexity - O(1)
     */
    private static boolean areEqualBySorting(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        if(n != m)
            return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i = 0; i < n; i++) {
            if(arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
