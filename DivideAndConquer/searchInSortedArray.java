public class searchInSortedArray {
    public static void main(String[] args) {
        int arr[] = {6,7,8,1,2,3,4,5};
        System.out.println(searchInSortedArray(arr, 4,0,arr.length-1));
    }

    public static int searchInSortedArray(int arr[], int target,int start,int end) {
        if (start > end) {
            return -1;
        }
    
        int mid = start + (end - start) / 2;
    
        if (arr[mid] == target) {
            return mid;
        }
    
        // Left half sorted
        if (arr[start] <= arr[mid]) {
    
            if (arr[start] <= target && target < arr[mid]) {
                return searchInSortedArray(arr, target, start, mid - 1);
            } else {
                return searchInSortedArray(arr, target, mid + 1, end);
            }
    
        }
    
        // Right half sorted
        else {
    
            if (arr[mid] < target && target <= arr[end]) {
                return searchInSortedArray(arr, target, mid + 1, end);
            } else {
                return searchInSortedArray(arr, target, start, mid - 1);
            }
    
        }
}
}
