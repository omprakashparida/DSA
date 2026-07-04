import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        // insert O(1)
        map.put("Coffee", 50);
        map.put("Burger", 50);
        map.put("Pizza", 199);
        map.put("Tea", 10);
        // System.out.println(map);

        // Get O(1)
        // System.out.println(map.get("Tea"));

        // Contains O(1)
        // System.out.println(map.containsKey("Matcha"));
        // System.out.println(map.containsKey("Burger"));

        // Remove O(1)
        map.remove("Tea");
        System.out.println(map);

        // size
        System.out.println(map.size());

        // isEmpty
        System.out.println(map.isEmpty());

        // iteration
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " : " + map.get(key));
        }
        // Set<Map.Entry<String, Integer>> entries = map.entrySet();

        // for (Map.Entry<String, Integer> entry : entries) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
    }
}
