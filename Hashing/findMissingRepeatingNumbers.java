import java.util.*;

public class findMissingRepeatingNumbers {

    public int[] findMissingRepeatingNumbers(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int duplicate = -1;
        int missing = -1;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                duplicate = entry.getKey();
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                missing = i;
            }
        }

        return new int[] { duplicate, missing };
    }

    public static void main(String[] args) {
        findMissingRepeatingNumbers obj = new findMissingRepeatingNumbers();

        int[] nums = { 3, 5, 4, 1, 1 };

        int[] ans = obj.findMissingRepeatingNumbers(nums);

        System.out.println(Arrays.toString(ans));
    }
}