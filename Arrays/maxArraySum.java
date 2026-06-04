import java.util.*;
public class maxArraySum {
    public static void main(String[] args) {
        int arr[] = {1,3,4,-3,7,9};
        maxSubArray(arr);
    }
    public static void maxSubArray(int arr[]){
        int currSum=0;
        int maxSum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum=0;
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                
            }
            System.out.println();
        }

    }
}
