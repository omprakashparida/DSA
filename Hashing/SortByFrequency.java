import java.util.*;

public class SortByFrequency {
    public static String frequencySort(String s) {

        // Count frequency of each character
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        //  Store map entries in a list
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        //  Sort the list by frequency (descending)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        //  Build the answer
        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            char ch = entry.getKey();
            int freq = entry.getValue();

            for (int i = 0; i < freq; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("cccaaa")); // aaaccc or cccaaa
        System.out.println(frequencySort("tree"));   // eert or eetr
    }
}