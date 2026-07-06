import java.util.*;

public abstract class largestSubarray {
    public static void main(String[] args) {
        //largest subarray sum with sum 0
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                length = Math.max(length, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println("Largest subarray sum = " + length);
    }
}
