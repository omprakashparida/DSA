public class longestSubArraySum {
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        System.out.println(longestSubArraySum(arr,15));    
    }
    public static int longestSubArraySum(int arr[],int k){
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum+=arr[j] ;
                if(sum==k){
                    int length = j-i+1;
                    maxLength = Math.max(maxLength, length);
                }
            }
        }
        return maxLength;
    }

}
