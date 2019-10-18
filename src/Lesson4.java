

public class Lesson4 {
    public static void main (String argv [] ) {
        boolean a = false;
        if (a) {
            System.out.println("line 1");
            System.out.println("line 2");
        } // without the brackets ---- line 2 is not in the if statement, and the else statement becomes "orphaned"
        else
            System.out.println("line 3 for else");

        // Loops
        for (int i = 1 /*starting initialization*/; i <= 5 /* while this is true, run the code below*/ ; i ++ /* every time my code runs, do this to my variable (i) */) {
            if (i % 2 != 0)
                System.out.println("Hello " + i);
                System.out.println(i);
            }
    }
}
