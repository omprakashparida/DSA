public class minDistance {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node lca(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }

        return root;
    }

    public static int distance(Node root, int target) {
        if (root == null) {
            return -1;
        }
        if (root.data == target) {
            return 0;
        }
        int left = distance(root.left, target);
        int right = distance(root.right, target);
        if (left != -1) {
            return left + 1;
        }
        if (right != -1) {
            return right + 1;
        }
        return -1;
    }

    public static int minDistance(Node root, int n1, int n2) {
        Node lcaNode = lca(root, n1, n2);
        return distance(lcaNode, n1) + distance(lcaNode, n2);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(minDistance(root, 4, 6));
    }
}
