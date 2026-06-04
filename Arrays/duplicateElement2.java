import java.lang.reflect.Array;
import java.util.Arrays;

public class duplicateElement2 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 8};
        System.out.println(duplicateElement2(arr));
    }

    public static boolean duplicateElement2(int arr[]) {
        //sorting array so that same element will be adjacent to each other
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
