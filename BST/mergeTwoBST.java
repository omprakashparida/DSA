import java.util.ArrayList;

public class mergeTwoBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inOrder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

    public static Node balanceBSt(ArrayList<Integer> finalArr, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(finalArr.get(mid));
        root.left = balanceBSt(finalArr, start, mid - 1);
        root.right = balanceBSt(finalArr, mid + 1, end);
        return root;
    }

    public static Node mergeTwoBST(Node root1, Node root2) {
        // calculate inorder for tree1
        ArrayList<Integer> arr1 = new ArrayList<>();
        inOrder(root1, arr1);
        // calculate inorder for tree2
        ArrayList<Integer> arr2 = new ArrayList<>();
        inOrder(root2, arr2);
        // final arrayList
        ArrayList<Integer> finalArr = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.size() && j < arr2.size()) {
            if (arr1.get(i) <= arr2.get(j)) {
                finalArr.add(arr1.get(i));
                i++;
            } else {
                finalArr.add(arr2.get(j));
                j++;
            }
        }
        while (i < arr1.size()) {
            finalArr.add(arr1.get(i));
            i++;
        }
        while (j < arr2.size()) {
            finalArr.add(arr2.get(j));
            j++;
        }
        return balanceBSt(finalArr, 0, finalArr.size()-1);
    }

    public static void main(String[] args) {
          // BST 1
    Node root1 = new Node(2);
    root1.left = new Node(1);
    root1.right = new Node(4);

    // BST 2
    Node root2 = new Node(9);
    root2.left = new Node(3);
    root2.right = new Node(12);

    Node root = mergeTwoBST(root1, root2);

    System.out.println("Preorder of Merged Balanced BST:");
    preorder(root);
    }
}
