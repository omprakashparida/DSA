public class duplicateElement {
    public static void main(String[] args) {
        int arr[] = { 1, 4, 5, 6, 9, 0 };
        System.out.println(duplicateElement(arr));
    }

    public static boolean duplicateElement(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                //if we find any match
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        //If we dont find match after iterating whole array
        return false;
    }

}