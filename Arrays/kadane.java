public class kadane {

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        kadaneMaxSum(arr);
    }
    public static void kadaneMaxSum(int arr[]){
        int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
            if (currSum<0) {
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        System.out.println(maxSum);
    }
}