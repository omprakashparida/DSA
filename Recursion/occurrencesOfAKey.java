public class occurrencesOfAKey {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 2, 5, 1, 2, 6, 2, };
        occurrencesOfAKey(arr, 0, 2);
    }

    public static void occurrencesOfAKey(int arr[], int idx, int key) {
        if (idx == arr.length) {
            return;
        }
        if (arr[idx] == key) {
            System.out.println(idx);
        }
        occurrencesOfAKey(arr, idx + 1, key);
    }
}