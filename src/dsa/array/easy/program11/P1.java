package dsa.array.easy.program11;

import java.util.*;

/*
Print all the distinct elements in an array
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {12, 10, 9, 45, 2, 10, 10, 45};
        method2(arr, arr.length);
    }

    /*
    Using set
    Time complexity - O(n)
    Space complexity - O(n) - Using HashSet of size - n
     */
    private static void method1(int[] arr, int n) {
        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < n; i++)
            hashSet.add(arr[i]);
        for(Integer x : hashSet)
            System.out.print(x + " ");
    }

    /*
        Using the hashmap
        Time complexity - O(n)
        Space complexity - O(k) - hashmap of distinct elements size
     */
    private static void method2(int[] arr, int n) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(!counterMap.containsKey(arr[i]))
                counterMap.put(arr[i], 1);
        }
        System.out.print(counterMap.keySet());
    }
}
