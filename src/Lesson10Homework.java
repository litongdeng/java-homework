import java.util.Scanner;

public class Lesson10Homework {
    public static void main (String [] argv) {
        // Project - "Coza Loza Woza"
        System.out.println("Any number that is a multiple of/contains three will be replaced by \"Coza\".");
        System.out.println("Any number that is a multiple of/contains five will be replaced by \"Loza\".");
        System.out.println("Any number that is a multiple of/contains seven will be replaced by \"Woza\".");
        System.out.println();
        System.out.println("Please input a number. ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n > 0) {
            for (int i = 1; i <= n; i++) {
                if (isMultiple(i, 3) || containsDigit(i, 3)) {
                    System.out.print("Coza" + " ");
                }
                if (isMultiple(i, 5) || containsDigit(i, 5)) {
                    System.out.print("Loza" + " ");
                }
                if (isMultiple(i, 7) || containsDigit(i, 7)) {
                    System.out.print("Woza" + " ");
                }
                if (!(isMultiple(i, 3) || containsDigit(i, 3) || isMultiple(i, 5) || containsDigit(i, 5) || isMultiple(i, 7) || containsDigit(i, 7))) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
            System.out.println("Please enter another number.");
            n = sc.nextInt();
        }
    }
    static boolean isMultiple(int a, int b) {
        if (b == 0) {
            return false;
        }
        if (a % b == 0) {
            return true;
        }
        return false;
    }

    static boolean containsDigit(int a, int b) {
        while (a != 0) {
            int singleDigit = a % 10;
            if (singleDigit == b) {
                return true;
            }
            a /= 10;
        }
        return false;
    }
}
