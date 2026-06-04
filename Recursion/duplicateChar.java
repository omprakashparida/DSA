public class duplicateChar {
    public static void main(String[] args) {

        String str = "omprakashparida";
        duplicateChar(str, 0, new StringBuilder(""), new boolean[26]);

    }

    public static void duplicateChar(String str, int index, StringBuilder newStr, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if (map[currChar - 'a'] == true) {
            duplicateChar(str, index + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            duplicateChar(str, index + 1, newStr.append(currChar), map);
        }

    }
}
