public class majorityElement {
    public static void main(String[] args) {
        int arr[] = {2,2,2,1,1,1,2};
        System.out.println(majorityElement(arr, 0, arr.length-1));
    }

    public static int majorityElement(int arr[], int start, int end) {
        // base case
        if (start == end) {
            return arr[start];
        }
        int mid = start + (end - start) / 2;
        int leftMajority = majorityElement(arr, start, mid);
        int rightMajority = majorityElement(arr, mid + 1, end);
        if (leftMajority == rightMajority) {
            return leftMajority;
        }
        int leftCount = 0;
        int rightCount = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] == leftMajority) {
                leftCount++;
            } else if (arr[i] == rightMajority) {
                rightCount++;
            }

        }
        return leftCount > rightCount ? leftMajority : rightMajority;
    }

}
