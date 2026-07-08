import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

public class BottomView {

    static void bottomView(Node root) {
        if (root == null)
            return;

        HashMap<Integer, Integer> map = new HashMap<>();
        Queue<Pair> q = new LinkedList<>();

        int min = 0, max = 0;

        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int hd = p.hd;

            // Update the latest node for this horizontal distance
            map.put(hd, curr.data);

            min = Math.min(min, hd);
            max = Math.max(max, hd);

            if (curr.left != null)
                q.offer(new Pair(curr.left, hd - 1));

            if (curr.right != null)
                q.offer(new Pair(curr.right, hd + 1));
        }

        // Print bottom view from left to right
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        bottomView(root);
    }
}