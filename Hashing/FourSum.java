import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        List<List<Integer>> result = fourSum(nums, target);

        for (List<Integer> quad : result) {
            System.out.println(quad);
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length; j++) {

                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int start = j + 1;
                int end = nums.length - 1;

                while (start < end) {
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                        start++;
                        end--;

                        while (start < end && nums[start] == nums[start - 1]) {
                            start++;
                        }

                        while (start < end && nums[end] == nums[end + 1]) {
                            end--;
                        }

                    } else if (sum > target) {
                        end--;
                    } else {
                        start++;
                    }
                }
            }
        }

        return ans;
    }
}