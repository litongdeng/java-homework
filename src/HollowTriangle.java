import java.util.Scanner;

public class HollowTriangle {
    public static void main (String argv []){


        // hollow triangle
        System.out.println("Please enter a value for the leg. ");
        Scanner sc = new Scanner(System.in);
        int leg = sc.nextInt();
        // step 1: top line
        int i = 1;
        while (i <= leg + 1) {
            System.out.print("* ");
            i++;
        }
        System.out.println();

        //step 2: middle part
        int line = 2;
        while (line <= leg) {
            //draw each middle line
            System.out.print("*  ");

            int space = 2;
            while (space <= leg - line + 1) {
                System.out.print("  ");
                space++;
            }
            System.out.println("*");
            line++;
        }
        System.out.println("*");


    }
}
