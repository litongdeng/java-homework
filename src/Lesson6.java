import java.util.Scanner;

public class Lesson6 {
    public static void main (String argv [] ) {
        // Counting from 1 to 100
//        int n = 1;
//        while (n <= 100) {
//            System.out.println(n++);
//        }
        // Draw a line with 20 stars
//        int r = 1;
//        while (r <= 20) {
//            int m = 1;
//            while (m++ <= 20) {
//                System.out.print("*  ");
//            }
//            r++;
//            System.out.println();
//        }
        // Draw a rectangle with user chosen number of stars for height and width
        Scanner sc = new Scanner(System.in);
//        System.out.println("Please input a value for the width.");
//        int width = sc.nextInt();
//        System.out.println("Please input a value for the height.");
//        int height = sc.nextInt(), h = 1;
//        while (h <= height) {
//            int w = 1;
//            while (w <= width) {
//                System.out.print("*  ");
//                w++;
//            }
//            System.out.println();
//            h++;
//        }
//        System.out.println("Please enter the length of the legs. ");
//        int legOne = 1, legOneInput = sc.nextInt();
//        int legTwoInput = sc.nextInt();
//        while (legOne <= legOneInput) {
//            int legTwo = 1;
//            while (legTwo <= legTwoInput) {
//                System.out.print("*");
//                legTwo++;
//            }
//            legOne++;
//        }
        System.out.println("Please input the leg length of your choice. ");
        int legInput = sc.nextInt();
        int line = 1;
        while (line <= legInput) {
            int star = 1;
            while (star <= line) {
                System.out.print("*  ");
                star++;
            }
            line++;
            System.out.println();
        }
    }
}
