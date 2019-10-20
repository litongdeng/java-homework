import java.util.Scanner;

public class Lesson7Homework {
    public static void main (String argv []) {
        Scanner sc = new Scanner(System.in);
        // Adds up user's input until user inputs 0, then prints out the sum of the inputs
        int total = 0;
        System.out.println("Please input an integer. ");
        int userInput = sc.nextInt();
        while (userInput != 0) {
            total += userInput;
            System.out.println("please input another integer.");
            userInput = sc.nextInt();
        }
        System.out.println("total value: " + total);
    }
}
