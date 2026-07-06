import java.util.*;

public class unionAndIntersection {
    public static void main(String[] args) {
        int arr1[] = { 3, 5, 7, 8, 10 };
        int arr2[] = { 2, 3, 5, 7, 11, 13 };
        HashSet<Integer> set = new HashSet<>();
        // union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.print("Union = ");
        for (Integer integer : set) {
            System.out.print(integer +" ");
        }
        set.clear();
        System.out.println();
        // intersection
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        System.out.print("Set = ");
        for (int i = 0; i < arr2.length; i++) {
            if (set.contains(arr2[i])) {
                System.out.print(arr2[i]+" ");
                set.remove(arr2[i]);
            }
        }
    }
}
