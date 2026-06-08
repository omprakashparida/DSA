public class mergeSortToSortArrayOfStrings {
    public static void main(String[] args) {
        String str[] = { "sun", "earth", "mars", "mercury" };
        mergeSortToSortArrayOfStrings(str, 0, str.length - 1);
        printarr(str);
    }

    public static void printarr(String str[]) {
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
    }

    public static void mergeSortToSortArrayOfStrings(String str[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSortToSortArrayOfStrings(str, start, mid);
        mergeSortToSortArrayOfStrings(str, mid + 1, end);
        merge(str, start, end, mid);
    }

    public static void merge(String str[], int start, int end, int mid) {
        String temp[] = new String[end - start + 1];
        int k = 0;
        int i = start;
        int j = mid + 1;
        while (i <= mid && j <= end) {
            if (str[i].compareTo(str[j]) <= 0) {
                temp[k] = str[i];
                i++;
                k++;
            } else {
                temp[k] = str[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k++] = str[i++];
        }
        while (j <= end) {
            temp[k++] = str[j++];
        }
        // copy values
        for (int index = 0; index < temp.length; index++) {
            str[start + index] = temp[index];
        }

    }
}
