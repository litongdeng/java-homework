public class Lesson6Homework {
    public static void main (String argv [] ) {
//        int x = 1;
//        while (x <= 100) {
//            if (x % 7 != 0 && Integer.toString(x).indexOf('7') < 0) {
//                System.out.println(x);
//            }
//            x++;
//        }

        // hollow square 5 x 5
       // int n = 20;
        int height = 10, width = 7;
        // step 1: top line
        int i = 1;
        while (i <= width) {
            System.out.print("* ");
            i++;
        }
        System.out.println();

        //step 2: middle part
        int line = 2;
        while (line <= height - 1) {
            //draw each middle line
            System.out.print("* ");

            int space = 2;
            while (space <= width - 1) {
                System.out.print("  ");
                space++;
            }
            System.out.println("*");
            line++;
        }
        // step 3: bottom line
        i = 1;
        while (i <= width) {
            System.out.print("* ");
            i++;
        }
        System.out.println();
    }
}
