class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null || head.next == null) {
            return null;
        }

        ListNode tail = head;
        int count = 1;

        while (tail.next != null) {
            tail = tail.next;
            count++;
        }

        int node = count - n;

        if (node == 0) {
            return head.next;
        }

        ListNode temp = head;
        int i = 1;

        while (i < node) {
            temp = temp.next;
            i++;
        }

        temp.next = temp.next.next;

        return head;
    }

    // Print Linked List
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create Linked List: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        RemoveNthFromEnd obj = new RemoveNthFromEnd();

        System.out.print("Original List: ");
        printList(head);

        int n = 2;
        head = obj.removeNthFromEnd(head, n);

        System.out.print("After Removing " + n + "th Node From End: ");
        printList(head);
    }
}