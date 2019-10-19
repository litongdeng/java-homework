import java.util.Scanner;

public class Lesson7Homework {
    public static void main (String argv []) {
        Scanner sc = new Scanner(System.in);
        // Adds up user's input until user inputs 0, then prints out the sum of the inputs
        int total = 0;
        while (true) {
            System.out.println("Please input an integer. ");
            int userInput = sc.nextInt();
            if (userInput != 0) {
                total += userInput;
            } else {
                System.out.println(total);
                break;
            }
        }
    }
}
