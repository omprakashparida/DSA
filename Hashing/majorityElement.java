import java.util.*;
public class majorityElement {
    public static void main(String[] args) {
        //find all elements that appear more than n/3 times in array
        int arr[] = {1,2,3,1,5,3,1,5,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > arr.length/3) {
                System.out.println(key);
            }
        }
    }
}
