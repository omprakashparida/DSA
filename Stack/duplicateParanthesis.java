import java.util.Stack;

public class duplicateParanthesis {
    public static boolean duplicateParanthesis(String str) {
        Stack<Character> ch = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ')') {
                int count = 0;
                while (ch.peek() != '(') {
                    ch.pop();
                    count++;
                }
                if(count == 0) {
                    return true;
                } else {
                    ch.pop();
                }
            } else {
                ch.push(c);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str = "(((a+b)+)+)";
        System.out.println(duplicateParanthesis(str));
    }
}
