public class towerOfHanoi {
    public static void main(String[] args) {

        towerOfHanoi(4, 'A', 'B', 'C');

    }

    public static void towerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // 1st move
        towerOfHanoi(n - 1, source, destination, helper);

        // print
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // final step
        towerOfHanoi(n - 1, helper, source, destination);
    }
}
