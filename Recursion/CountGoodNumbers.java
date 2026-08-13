public class CountGoodNumbers {

    static final long MOD = 1_000_000_007L;

    public static void main(String[] args) {

        long n = 4;

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long result = power(5, evenPositions);
        result = (result * power(4, oddPositions)) % MOD;

        System.out.println(result);
    }

    static long power(long base, long exp) {
        long result = 1;

        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }
}
