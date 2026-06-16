public class linkedList {
    public static void main(String[] args) {
        linkedList ll = new linkedList();

        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(1);
        ll.print();
        ll.addLast(2);
        ll.print();

        // ll.removeLast();
        System.out.println(ll.isPalindrome());
        ll.print();
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        // create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // newNode next-> head
        newNode.next = head;

        // head -> newNode
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int idx, int data) {

        if (idx == 0) {
            addFirst(data);
            return;
        }
    
        size++;
    
        Node newNode = new Node(data);
    
        int i = 0;
        Node temp = head;
    
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
    
        newNode.next = temp.next;
        temp.next = newNode;
    
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public int removeFirst() {

        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (head == null) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node temp = head;
        int idx = 0;
        while (idx < size - 2) {
            temp = temp.next;
            idx++;
        }
        int val = tail.data;
        tail = temp;
        temp.next = null;
        size--;
        return val;

    }

    public void reverseLinkedList() {
        Node curr = tail = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    // remove nth Node
    public void removeNthNode(int n) {
        if (n == size) {
            head = head.next;
            size--;
            return;
        }
        Node temp = head;
        for (int i = 1; i < size - n; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    private Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome() {

        // 1. find mid
        Node mid = findMid(head);

        // 2. reverse second half
        Node right = reverse(mid);
        reverse(right);
        Node left = head;

        // 3. compare left and right
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }
}
