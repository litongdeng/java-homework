import java.util.Scanner;

public class Lesson4Homework {
    public static void main (String argv []) {
        Scanner sc = new Scanner(System.in);
        // Have user enter 10 numbers, and add up all odd numbers from the inputs, and print out the result.
        int result = 0;
        for (int count = 1; count <= 10; count ++) {
            System.out.println("Please enter " + (10 - count + 1) + " numbers");
            int number = sc.nextInt();
            if (number % 2 != 0) {
                result += number;
            }
        }
        System.out.println(result);

        // Have user enter a number N, and calculate the factorial of N, i.e. N!
        int factorial = 1;
        System.out.println("Please enter a number N");
        int n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++)
            factorial *= i;
        System.out.println("factorial of " + n + " = " + factorial);

        //Have a user enter a number N, then print out every third number counting from 1 till N. I.e. if N = 11, then print 1, 4, 7, 10
        int numberPlusThree = -2;
        System.out.println("Please enter a number. ");
        int endNumber = sc.nextInt();
        for (int x = 0; x <= endNumber; x = x + 3) {
            System.out.println(numberPlusThree += 3);
        }
    }
}
// You can forcefully stop a loop by using the "break" command