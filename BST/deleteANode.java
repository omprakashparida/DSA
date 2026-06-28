public class deleteANode {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean search(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        if (root.data < target) {
            return search(root.right, target);
        } else {
            return search(root.left, target);
        }

    }

    public static Node deleteANode(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (val < root.data) {
            root.left = deleteANode(root.left, val);
        } else if (val > root.data) {
            root.right = deleteANode(root.right, val);
        } else {
            // case1 leaf node
            if (root.left == null && root.right == null) {
                return null;
            }
            // case2 single child
            if (root.left == null && root.right != null) {
                return root.right;
            } else if (root.left != null && root.right == null) {
                return root.left;
            }
            // case3 Two Child
            Node successor = findInorderSuccessor(root.right);
            root.data = successor.data;
            root.right = deleteANode(root.right, successor.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.left.left.left = new Node(1);
        root.left.left.right = new Node(4);
        root.right.right.right = new Node(14);
        System.out.print("Before: ");
        inorder(root);
        root = deleteANode(root, 10);
        System.out.print("\nAfter: ");
        inorder(root);

    }
}