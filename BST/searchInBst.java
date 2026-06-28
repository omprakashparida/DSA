public class searchInBst {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static boolean search(Node root,int target){
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        if (root.data < target) {
          return search(root.right, target);
        }else{
           return search(root.left, target);
        }

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
    System.out.println(search(root, 1));




   } 
}
