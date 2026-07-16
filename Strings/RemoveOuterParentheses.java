public class RemoveOuterParentheses {

    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int depth = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                if (depth > 0) {
                    ans.append(s.charAt(i));
                }
                depth++;
            } else {
                depth--;
                if (depth > 0) {
                    ans.append(s.charAt(i));
                }
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String input = "(()())(())(()(()))";

        RemoveOuterParentheses obj = new RemoveOuterParentheses();
        String result = obj.removeOuterParentheses(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}