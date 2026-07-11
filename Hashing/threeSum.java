import java.util.*;

public class threeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        threeSum obj = new threeSum();

        int[] nums = { -1, 0, 1, 2, -1, -4 };

        List<List<Integer>> result = obj.threeSum(nums);

        System.out.println("Triplets:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}