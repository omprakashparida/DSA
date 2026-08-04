public class RotateLinkedList{

    // Definition for singly-linked list.
    static class ListNode {
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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int length = 0;

        while (temp != null) {
            temp = temp.next;
            length++;
        }

        int rotation = k % length;
        if (rotation == 0) {
            return head;
        }

        int steps = length - rotation;

        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }

        // Make the list circular
        tail.next = head;

        // Find the new tail
        ListNode newTail = head;
        for (int i = 0; i < steps - 1; i++) {
            newTail = newTail.next;
        }

        // Break the circle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateLinkedList solution = new RotateLinkedList();
    
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
    
        System.out.print("Original List: ");
        printList(head);
    
        int k = 2;
        head = solution.rotateRight(head, k);
    
        System.out.print("Rotated List: ");
        printList(head);
    }
}