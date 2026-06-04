public class optimizedBubbleSort {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 6, 1, 3 };
        bubbleSort(arr);
        printarr(arr);
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = true;
            for (int j = 0; j < arr.length - i - 1; j++) {

                // swap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped) {
                break;
            }
        }
    }
}
