import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class PairFinder {
    /*
    "You are given an array of N integers, you want to group the numbers into pairs such that the sum of the elements of each pair is the same. Each element can be a part of at most 1 pair. It is not necessary for all the elements to be part of some pair.
Determine the maximum number of pairs such that the sum of the elements is the same for all pairs."
"Input = [1, 2, 6, 6, 5]
Output: 2"

     */
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 6, 6, 5};
        int start = 0, end = arr.length - 1, noOfPairs = 0;
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i != j) {
                    int sum = arr[i] + arr[j];
                    if(map.containsKey(arr[i])) {
                        Set<Integer> arrList = map.get(arr[i]);
                        arrList.add(sum);
                        map.put(arr[i], arrList);
                    } else {
                        Set<Integer> arrList = new HashSet<>();
                        arrList.add(sum);
                        map.put(arr[i], arrList);
                    }
                }
            }
        }

        System.out.println(map.toString());
        int counter = 0;
        Set<Integer> differentSum = new HashSet<>();
        List<Integer> mergedSums = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            differentSum.addAll(map.get(arr[i]));
            mergedSums.addAll(map.get(arr[i]));
        }

        System.out.print(differentSum.toString());
        System.out.print(mergedSums.toString());

        System.out.print("No. of pairs with the same sum : " + noOfPairs);
    }
}
