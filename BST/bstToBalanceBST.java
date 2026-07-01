import java.util.*;

public class bstToBalanceBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void inOrder(Node root, ArrayList<Integer> inorder) {
        if (root == null) {
            return;
        }
        inOrder(root.left, inorder);
        inorder.add(root.data);
        inOrder(root.right, inorder);
    }

    public static Node buildBST(ArrayList<Integer> inorder, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = buildBST(inorder, start, mid - 1);
        root.right = buildBST(inorder, mid + 1, end);
        return root;
    }

    public static Node balanceBST(Node root) {
        ArrayList<Integer> inOrder = new ArrayList<>();
        inOrder(root, inOrder);
        return buildBST(inOrder, 0, inOrder.size() - 1);

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // Unbalanced BST
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
    
        System.out.println("Balanced BST (Preorder):");
        root = balanceBST(root);
        preorder(root);
    }
}
