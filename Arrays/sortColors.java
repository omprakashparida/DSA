public class sortColors {

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 2, 1 };
        sortZeroOneTwo(nums);
        printarr(nums);
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortZeroOneTwo(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else if (nums[i] == 1) {
                one++;
            } else {
                two++;
            }
        }
        while (zero > 0) {
            nums[k] = 0;
            zero--;
            k++;
        }
        while (one > 0) {
            nums[k] = 1;
            one--;
            k++;
        }
        while (two > 0) {
            nums[k] = 2;
            two--;
            k++;
        }
    }
}