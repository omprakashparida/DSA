import java.util.*;

public class AddTwoNumbers {

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

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        ListNode temp1 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;

        while (temp != null || temp1 != null || carry != 0) {

            int digit1 = (temp != null) ? temp.val : 0;
            int digit2 = (temp1 != null) ? temp1.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            if (temp != null) {
                temp = temp.next;
            }

            if (temp1 != null) {
                temp1 = temp1.next;
            }
        }

        return dummy.next;
    }

    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};

        ListNode l1 = createList(arr1);
        ListNode l2 = createList(arr2);

        System.out.print("List 1: ");
        printList(l1);

        System.out.print("List 2: ");
        printList(l2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result);
    }
}