package dsa.array.easy.program14;

/*
Find subarray with given sum
 */
public class P1 {
    public static void main(String[] args) {
        int[] arr = {1,4,20,3,10,5};
        int sum = 33, n = arr.length;
        method1(arr, n, sum);
    }

    /*
    Using sliding window algorithm
    Time complexity - O(n^2)
    Space complexity - O(1)
     */
    private static void method1(int[] arr, int n, int sum) {
        int currentSum = arr[0], start = 0;
        for(int i = 1; i <= n; i++) {
            while(currentSum > sum && start < i-1) {
                currentSum = currentSum - arr[start];
                start++;
            }

            if(currentSum == sum) {
                System.out.print("pair start index : " + start + ", end index : " + (i-1));
                return;
            }

            if(i < n)
                currentSum = currentSum + arr[i];
        }
    }
}
