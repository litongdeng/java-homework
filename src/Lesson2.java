public class Lesson2 {

    public static void main (String argv []) {
        int x; //declare
        x = 2; //assign
        // initialize y with some value
        int y = 5;
        int z = 10;
        // assigning a variable using operations and other integers
        z = x + y;
        int w = x - y;
        w = x * y;
        x = z / y;
        y = w - x;
        w = y % z; // mod AKA remainder
        // print the values
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("w = " + w);

        System.out.println(y + " % " + z + " = " + (y % z)); // print "9 mod 7 equals 2"
        System.out.println(y + z); // 9 + 7 = 16 (only prints the sum)
        System.out.println(y + "" + z); // prints 9, immediately followed by 7

        x += 3; // x = 4
        y -= 6; // y = 3
        z *= 2; // z = 14
        w /= 4; // w = 0
        x %= y; // x = 1

        System.out.println("After the calculation: ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("w = " + w);

        x++; // same as x = x + 1 OR x += 1; no space in between plus signs
        y--; // same as y = y - 1 OR y -= 1

        /* practice */
        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " - " + y + " = " + (x - y));
        System.out.println(x + " * " + y + " = " + (x * y));
        System.out.println(x + " / " + y + " = " + (x / y));
        System.out.println(x + " % " + y + " = " + (x % y));
        // "println" means print, then go to next line

        System.out.print ("A\nB");
        System.out.println("sdfghjksdfghj\"dfghj\"");
        System.out.println("\\\\");

        int v = 5;
        String s = "I am a String";
        String s2 = "\\ is for backslash";
        String s3 = "\" is double quote";

        System.out.println("s2 is: " + s2);
        
    }

}
