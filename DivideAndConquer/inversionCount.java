public class inversionCount {
    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }

    public static int mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return 0;
        }
        int mid = start + (end - start) / 2;

        int leftInv = mergeSort(arr, start, mid);

        int rightInv = mergeSort(arr, mid + 1, end);

        int invCount = merge(arr, start, end, mid);
        return leftInv + rightInv + invCount;
    }

    public static int merge(int arr[], int start, int end, int mid) {
        int invCount = 0;
        int i = start;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += mid - i + 1;
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }
        // copy values
        for (int index = 0; index < temp.length; index++) {
            arr[start + index] = temp[index];
        }
        return invCount;
    }
}
