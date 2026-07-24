import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String goal = sc.nextLine();

        if (s.length() != goal.length()) {
            System.out.println(false);
            return;
        }

        String doubled = s + s;

        if (doubled.contains(goal)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}