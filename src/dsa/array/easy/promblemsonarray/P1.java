package dsa.array.easy.promblemsonarray;

/*
Check whether an array is circularly sorted or not
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {23, 34, 45, 12, 17, 19};
        if(isCircularlySorted(arr, arr.length))
            System.out.print("Array is circularly sorted!");
        else
            System.out.print("Array is not circularly sorted!");
    }

    /*
    Time complexity - O(n)
    Space complexity - O(1)
     */
    private static boolean isCircularlySorted(int[] arr, int n) {
        int count = 0;
        for(int i = 1; i < n; i++) {
            if(arr[i-1] > arr[i])
                count++;
        }
        return (count == 1) ? true : false;
    }
}
