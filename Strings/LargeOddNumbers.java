import java.util.*;

public class LargeOddNumbers {

    public static String largeOddNum(String s) {
        int end = -1;
        int start = 0;

        // Find the last odd digit
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) - '0') % 2 != 0) {
                end = i;
                break;
            }
        }

        // Remove leading zeros
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0') {
                start = i;
                break;
            }
        }

        if (end == -1) {
            return "";
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        String s = sc.nextLine();

        String result = largeOddNum(s);

        System.out.println("Largest odd number: " + result);

        sc.close();
    }
}