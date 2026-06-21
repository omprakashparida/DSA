import java.util.Stack;

public class validParanthesis {
    public static boolean validParanthesis(String str) {
        Stack<Character> ch = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c=='[' || c=='(' || c == '{') {
                ch.push(c);
            }else{
                if (ch.isEmpty()) {
                    return false;
                }else{
                    if (ch.peek()=='{'&&c == '}' || ch.peek()=='['&&c == ']' || ch.peek()=='('&&c == ')' ) {
                        ch.pop();
                    }
                }
            }
        }
        if (ch.isEmpty()) {
            return true ;    
        }else return false;
    }

    public static void main(String[] args) {
        String str = "}]";
        System.out.println(validParanthesis(str));

    }
}
