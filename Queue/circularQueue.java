public class circularQueue {

    public static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue Is full");
                return;
            }
            // adding 1st elemnt
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;

        } // remove

        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue IS empty");
                return -1;
            }
            int result = arr[front];
            if (front == rear) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        q.add(4);
        // System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}