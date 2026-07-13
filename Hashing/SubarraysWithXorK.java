import java.util.*;

public class SubarraysWithXorK {
    public static void main(String[] args) {
        int nums[] = { 4, 2, 2, 6, 4 };
        int k = 6;
        System.out.println("Largest subarray XOR = " + subarraysWithXorK(nums,k));
    }

    public static int subarraysWithXorK(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            xor ^= nums[i];
            if (map.containsKey(xor ^ k)) {
                count += map.get(xor ^ k);
            } else {
                map.put(xor, map.getOrDefault(xor, 0) + 1);
            }

        }
        return count;
    }
}
