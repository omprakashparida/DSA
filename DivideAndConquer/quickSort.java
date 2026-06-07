public class quickSort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 3, 1, 9, 0, -5, -100 };
        quickSort(arr, 0, arr.length - 1);
        printarr(arr);

    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int PIdx = partition(arr, start, end);
        quickSort(arr, start, PIdx - 1);
        quickSort(arr, PIdx + 1, end);

    }

    public static int partition(int arr[], int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;

    }
}
