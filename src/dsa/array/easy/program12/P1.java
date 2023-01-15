package dsa.array.easy.program12;

import java.util.HashMap;
import java.util.Map;

/*
Find the element that appears once in an array where
every other element appears twice
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,4,5,3,4};
        int n = arr.length;
        method1(arr, n);
    }

    /*
    HashMap approach
    Time complexity - O(n)
    Space complexity - O(n) - using hashmap for storing the counter
     */
    private static void method1(int[] arr, int n) {
        Map<Integer, Integer> counterMap = new HashMap<>();
        int value = 0;
        for(int i = 0; i < n; i++) {
            value = counterMap.containsKey(arr[i]) ? counterMap.get(arr[i]) + 1 : 1;
            counterMap.put(arr[i], value);
        }
        counterMap.forEach((k,v) -> {
            if(v == 1)
                System.out.print(k);
        });
    }
}
