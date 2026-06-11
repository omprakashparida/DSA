public class findSubsets {
    public static void main(String[] args) {
        findSubsets("abc", "", 0);
    }

    public static void findSubsets(String str, String ans, int idx) {
        if (idx == str.length()) {
            if (ans.equals("")) {
                System.out.println("null");
                return;
            } else {
                System.out.println(ans);
                return;
            }

        }
        char curr = str.charAt(idx);
        // include curr character
        findSubsets(str, ans + curr, idx + 1);
        // exclude curr character
        findSubsets(str, ans, idx + 1);
    }
}
