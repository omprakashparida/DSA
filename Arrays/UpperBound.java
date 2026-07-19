public class UpperBound {

    public static int upperBound(int[] nums, int x) {
        int start = 0;
        int end = nums.length - 1;
        int ans = nums.length;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > x) {
                ans = mid;    
                end = mid - 1;  
            } else {
                start = mid + 1; 
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3};
        int x = 2;

        int result = upperBound(nums, x);

        System.out.println("Upper Bound Index: " + result);
    }
}