public class maxArraySum2 {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        prefixMaxSum(arr);
    }
    public static void prefixMaxSum(int arr[]){
        int prefix[]=new int[arr.length];
        prefix[0]= arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];

        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < prefix.length; i++) {
            for (int j = i; j < prefix.length; j++) {
                int currSum = 0;
                if (i==0) {
                    currSum=prefix[j];
                }else{
                    currSum=prefix[j]-prefix[i-1];
                }
                if (currSum>maxSum) {
                    maxSum=currSum;
                }
            }
        }
        System.out.println(maxSum);
    }
    
}
