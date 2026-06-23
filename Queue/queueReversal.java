import java.util.*;

public class queueReversal {
    public static void reverseQueue(Queue<Integer> q) {

        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(5);
        q.add(7);
        q.add(9);
        reverseQueue(q);
        while (!q.isEmpty()) {
            System.out.println(q.remove() + " ");
        }
    }
}
