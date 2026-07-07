import java.util.*;

public class subarraySumEqualsTok {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10 };
        HashMap<Integer, Integer> map = new HashMap<>();
        // value and frquency
        int k = -10;
        int sum = 0;
        int subarray = 0;

        map.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        
            if (map.containsKey(sum - k)) {
                subarray += map.get(sum - k);
            }
        
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(subarray);
    }
}
