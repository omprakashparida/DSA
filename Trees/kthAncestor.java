public class kthAncestor {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    static int ans = -1;

    public static int kthAncestor(Node root, int k, int target) {
        if (root == null) {
            return -1;
        }

        if (root.data == target) {
            return 0;
        }

        int left = kthAncestor(root.left, k, target);
        int right = kthAncestor(root.right, k, target);

        if (left == -1 && right == -1) {
            return -1;
        }

        int distance = Math.max(left, right) + 1;

        if (distance == k) {
            ans = root.data;
        }

        return distance;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthAncestor(root, 2, 4);

        System.out.println(ans);
    }
}
