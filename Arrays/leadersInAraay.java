import java.util.*;
public class leadersInAraay {
    public static List<Integer> leaders(int[] nums) {
        List<Integer> result = new ArrayList<>();

        int maxRight = Integer.MIN_VALUE;

        // Traverse from right to left
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxRight) {
                result.add(nums[i]);
                maxRight = nums[i];
            }
        }

        // Reverse to maintain original order
        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-3, 4, 5, 1, -30, -10};

        List<Integer> ans = leaders(nums);

        System.out.println(ans);
    }
}
