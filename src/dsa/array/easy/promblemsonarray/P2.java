package dsa.array.easy.promblemsonarray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 Check if two arrays are equal using sorting

 */
public class P2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};
        if(areEqualByMap(arr1, arr2))
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

    /*
    using hashmap
    Time complexity - O(n)
    Space complexity - O(1)
     */
    private static boolean areEqualByHashing(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(!hashMap.containsKey(arr1[i]))
                hashMap.put(arr1[i], 1);
            else {
                hashMap.put(arr1[i], hashMap.get(arr1[i]) + 1);
            }
        }

        for(int i = 0; i < m; i++) {
            if(!hashMap.containsKey(arr2[i]))
                return false;

            if(hashMap.get(arr2[i]) == 0)
                return false;

            int counter = hashMap.get(arr2[i]);
            --counter;
            hashMap.put(arr2[i], counter);
        }
        return true;
    }

    /*
    using map
    Time complexity - O(n)
    Space complexity - O(n)
     */
    private static boolean areEqualByMap(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        HashMap<Integer, Integer> umap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            umap.put(arr1[i], umap.getOrDefault(arr1[i], 0) + 1);
        }

        for(int i = 0; i < m; i++) {
            if(umap.containsKey(arr2[i])) {
                umap.put(arr2[i], umap.get(arr2[i]) - 1);
                if(umap.get(arr2[i]) == 0)
                    umap.remove(arr2[i]);
            }
        }
        if(umap.size() == 0)
            return true;
        return false;
    }
}
