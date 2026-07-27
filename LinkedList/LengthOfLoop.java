class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LengthOfLoop {

    public static int findLoopLength(Node head) {
        Node slow = head;
        Node fast = head;

       
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {

                int count = 1;
                Node temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }

                return count;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

      
        head.next.next.next.next.next = head.next;

        System.out.println("Length of Loop: " + findLoopLength(head));

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(7);
        head2.next.next.next = new Node(4);

        System.out.println("Length of Loop: " + findLoopLength(head2));
    }
}