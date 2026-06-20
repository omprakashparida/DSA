import java.util.*;
public class reverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx<str.length()) {
            char ch = str.charAt(idx);
            s.push(ch);
            idx++;

        }
        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hello";
        String result = reverseString(str);
        System.out.println(result);
    }
}
