public class maximumSubArraySum {
    public static void main(String[] args) {

        int arr[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println( maxSubArray(arr, 0, arr.length - 1));
    }

    public static int maxSubArray(int arr[], int start, int end) {

        // Base Case
        if (start == end) {
            return arr[start];
        }

        int mid = start + (end - start) / 2;

        // Left Half
        int leftMax = maxSubArray(arr, start, mid);

        // Right Half
        int rightMax = maxSubArray(arr, mid + 1, end);

        // Crossing Sum
        int crossMax = crossingSum(arr, start, mid, end);

        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    public static int crossingSum(int arr[], int start, int mid, int end) {

        int leftSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = mid; i >= start; i--) {
            sum += arr[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;

        for (int i = mid + 1; i <= end; i++) {
            sum += arr[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }

}
