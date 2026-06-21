import java.util.Stack;

public class reverseAStack {
    public static void pushAtBottom(int data,Stack<Integer> s){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }
    public static void printstack(Stack<Integer> s){
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void reverseAStack(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseAStack(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
      Stack<Integer> s = new Stack<>();
      s.push(1);
      s.push(2);
      s.push(3);
      reverseAStack(s);
      printstack(s);
    }
}
