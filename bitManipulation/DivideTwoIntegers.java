public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        boolean negative = (dividend < 0) ^ (divisor < 0);

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            while ((temp << 1) <= dvd) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            quotient += multiple;
        }

        return negative ? -quotient : quotient;
    }

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 3;

        int result = divide(dividend, divisor);

        System.out.println("Dividend: " + dividend);
        System.out.println("Divisor : " + divisor);
        System.out.println("Quotient: " + result);
    }
}
