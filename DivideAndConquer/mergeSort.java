public class mergeSort {
    public static void main(String[] args) {
        int arr[]= {2,4,5,3,1,9,0};
        mergeSort(arr, 0, arr.length-1);
        printarr(arr);

    }
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, end, mid);
    }

    public static void merge(int arr[], int start, int end, int mid) {
        int temp[] = new int[end - start + 1];
        int k = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        //copy values
        for (int index = 0; index < temp.length; index++) {
            arr[start+index]=temp[index];
        }

    }
}
