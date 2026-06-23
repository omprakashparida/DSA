import java.util.*;
public class stackUsingDeque {
    static class Stack{
        Deque <Integer> dq = new LinkedList<>();

        //push
        public void push(int data){
            dq.addLast(data);
        }
        //pop
        public int pop(){
            return dq.removeLast();
        }

        //peek
        public int peek(){
            return dq.getLast();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(0);
        s.push(4);
        s.push(2);
        s.push(6);
        System.out.println(s.peek());
    }
}
