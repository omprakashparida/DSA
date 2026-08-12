public class PowCalculator {
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;

        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;

        while (N > 0) {
            if (N % 2 == 1) {
                ans *= x;
            }
            x *= x;
            N /= 2;
        }

        return ans;
    }
}