public class backtrackingOnArrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        backtrackingOnArrays(arr, 0, 1);
        printarr(arr);
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void backtrackingOnArrays(int arr[], int idx, int val) {
        // basecase
        if (idx == arr.length) {
            return;
        }
        arr[idx] = val;
        backtrackingOnArrays(arr, idx + 1, val + 1);
        arr[idx] -= 2;
    }
}