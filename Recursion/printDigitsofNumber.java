public class printDigitsofNumber {
    public static void main(String[] args) {
        String digits[] = {
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine"
        };
        printDigits(1987, digits);
    }
    public static void printDigits(int n ,String digits[]){
        if (n==0) {
            return;
        }
        printDigits(n/10, digits);
        int lastPlace = n%10;
        System.out.println(digits[lastPlace]);
    }
}
