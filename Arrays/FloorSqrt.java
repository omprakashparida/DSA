import java.util.Scanner;

public class FloorSqrt {

    public static int floorSqrt(int n) {
        int start = 0;
        int end = n;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = 1L * mid * mid;

            if (square == n) {
                return mid;
            }

            if (square < n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Floor Square Root: " + floorSqrt(n));

        sc.close();
    }
}
