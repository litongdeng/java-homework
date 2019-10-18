import java.util.Scanner;

public class Lesson4Exercises {
    public static void main (String argv []) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter a number N.");
//        int n = sc.nextInt();
//        int total = 0;
//        for (int i = 1 ; i <= n ; i ++) {
//            total = total + i;
//        }
//        System.out.println(total);
//
//        int factorial = 1;
//        for (int i = 1 ; i <= n ; i++)
//            factorial *= i;
//        System.out.println("factorial of " + n + " = " + factorial);
//
//        System.out.println("Counting down from " + n + " to 1.");
//        for (int i = n ; i >= 1 ; i--)
//            System.out.println(i);

//        for (int i = 1 ; i <= n ; i++) {
//            System.out.print("*");
//        }
//        for (int row = 1; row <= n ; row ++) {
//            for (int i = 1; i <= n; i++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
        System.out.println("Please enter a value for the width. ");
        int widthMeasure = sc.nextInt();
        System.out.println("Enter a value for the length.");
        int lengthMeasure = sc.nextInt();
        System.out.println(lengthMeasure);
        for (int length = 1; length <= lengthMeasure ; length ++) {
           for (int width = 1; width <= widthMeasure ; width ++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
