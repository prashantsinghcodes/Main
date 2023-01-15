package dsa.array.easy.program10;

/*
Number of triangles from an array of sides
Time complexity - O(n^2)
Space complexity - O(1)
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 3, 7};
        int n = arr.length;
        method1(arr, n);
        System.out.print("Number of triangles : " + method1(arr, n));
    }

    private static int method1(int[] arr, int n) {
        int i, k, j, counter = 0;
        for(i = 0; i < n-1; i++) {
            k = i+1; j = n-1;
            while(j > i+1) {
                if(isItATriangle(arr, i, k, j))
                    counter++;
                j--;
            }
        }
        return counter;
    }

    private static boolean isItATriangle(int[] arr, int i, int k, int j) {
        return (arr[i] + arr[k] > arr[j]) && (arr[i] + arr[k] > arr[j])
                && (arr[k] + arr[j] > arr[i]);
    }
}
