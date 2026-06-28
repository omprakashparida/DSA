public class sumTree {
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

    public static int sumTree(Node root){
        if (root == null) {
            return 0;
        }
        int originalValue = root.data;
        int leftSum = sumTree(root.left);
        int rightSum = sumTree(root.right);
        root.data = leftSum + rightSum;
        return originalValue+leftSum+rightSum;

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(sumTree(root));
    }

}
