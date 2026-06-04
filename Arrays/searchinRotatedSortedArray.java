public class searchinRotatedSortedArray {
    public static void main(String[] args) {
        int num[] = { 6, 7, 0, 1, 2, 3, 4, 5 };
        System.out.println(searchinRotatedSortedArray(num));
    }

    
    public static int searchinRotatedSortedArray(int num[]) {
    int low = 0;
    int high = num.length - 1;
    int taregt = 4;

    while (low <= high) {
    int mid = (low + high) / 2;

    if (num[mid] == taregt) {
    return mid;
    }

    // Left side sorted
    if (num[low] <= num[mid]) {

    if (taregt >= num[low] && taregt < num[mid]) {
    high = mid - 1;
    } else {
    low = mid + 1;
    }
    }
    // Right side sorted
    else {
    if (taregt > num[mid] && taregt <= num[high]) {
    low = mid + 1;
    } else {
    high = mid - 1;
    }
    }
    }
    return -1;
    }
}