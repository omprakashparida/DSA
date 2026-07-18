import java.util.HashMap;

public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            // Check mapping from s -> t
            if (mapST.containsKey(chS)) {
                if (mapST.get(chS) != chT) {
                    return false;
                }
            } else {
                mapST.put(chS, chT);
            }

            // Check mapping from t -> s
            if (mapTS.containsKey(chT)) {
                if (mapTS.get(chT) != chS) {
                    return false;
                }
            } else {
                mapTS.put(chT, chS);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));    // true
        System.out.println(isIsomorphic("apple", "bbnbm")); // false
        System.out.println(isIsomorphic("foo", "bar"));     // false
        System.out.println(isIsomorphic("paper", "title")); // true
    }
}