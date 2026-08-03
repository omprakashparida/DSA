class Node {
    int data;
    Node prev, next;

    Node(int data) {
        this.data = data;
    }
}

public class DeleteAllOccurrences {

    // Delete all occurrences of target
    static Node deleteAllOccurrences(Node head, int target) {
        Node curr = head;

        while (curr != null) {
            if (curr.data == target) {
                Node nextNode = curr.next;

                if (curr.prev != null) {
                    curr.prev.next = curr.next;
                } else {
                    head = curr.next; // deleting head
                }

                // Update next node
                if (curr.next != null) {
                    curr.next.prev = curr.prev;
                }

                curr = nextNode;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" <-> ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(7);
        head.next = new Node(7);
        head.next.prev = head;

        head.next.next = new Node(7);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(7);
        head.next.next.next.prev = head.next.next;

        int target = 7;

        System.out.print("Original List: ");
        printList(head);

        head = deleteAllOccurrences(head, target);

        System.out.print("Modified List: ");
        if (head == null)
            System.out.println("Empty");
        else
            printList(head);
    }
}