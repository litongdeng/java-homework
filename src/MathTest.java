import java.util.Scanner;

public class MathTest {
    public static void main (String argv []) {
        game: while (true) { // sentinel is often used with while (true)
            System.out.println("Welcome to the math challenge! Please answer the question, enter 99999 to quit, or enter 77777 to skip the current question. ");
            int n1 = (int) (Math.random() * 10);
            int n2 = (int) (Math.random() * 10);
            System.out.println(n1 + " + " + n2 + " = ? ");

            while (true) {
                Scanner sc = new Scanner(System.in);
                int answer = sc.nextInt();

                if (answer == 99999) { // Sentinel: A variable that, when reached, breaks out of the loop.
                    break game;
                }
                if (answer == 77777) {
                    System.out.println("Ok, it should be " + (n1 + n2 + ", let's try another question!"));
                    break;
                }
                if (answer == n1 + n2) {
                    System.out.println("Yes, you are correct!");
                    break; //breaks out of the "closest" loop
                } else {
                    System.out.println("Try again.");
                }
            }
        }
        System.out.println("Thanks for playing. See you soon!");
    }
}
