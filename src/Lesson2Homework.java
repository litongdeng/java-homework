import java.util.Scanner;

public class Lesson2Homework {
    public static void main ( String argv [] ) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter the value for x: ");
        int x = sc.nextInt(); //take input from user, assigns it to x as an int
        // int x = 3; // hard-coding a value
        System.out.println("Please enter the value for y: ");
        int y = sc.nextInt();
        // int y = 5;
        int z = 7;
        int average = (x + y + z) / 3;
        System.out.println(" (" + x + " + " + y + " + " + z + ") " + "/ " + 3 + " = " + average);
        // in-class review
        double d = 3.5;
        double average2 = (x + (double)y + z) / 3.0; //casting: converting int into double
        System.out.println(" (" + x + " + " + y + " + " + z + ") " + "/ " + 3 + " = " + average2);

        //continuing Scanner work
        System.out.println ("Please enter what operation you would like to use. (+, -, *, /, %)");
        //int, double, String (data types)
        char aCharacter = 'Z';
        char operation = sc.next().charAt(0); // only takes the first character of whatever the user inputs
        System.out.println ("operation = " + operation);
        // single quotes are for single characters, double quotes are for multiple characters
        int result = 0;
        boolean tf = false;
        boolean lh = true;

        boolean b1 = !tf; //true
        boolean b2 = !lh; //false

        boolean homework = true, dishes = false;
        boolean canPlay_mom =  homework && dishes;
        boolean canPlay_dad = homework || dishes;

        if (canPlay_mom != canPlay_dad)
            System.out.println ("What do we do?");
        else
            System.out.println ("We are agreeing.");

        boolean b5 = operation == '+';
        boolean valid = true;
        if ( b5 ) //conditional statement
            result = x + y;
        else if (operation == '-')
            result = x - y;
        else if (operation == '*')
            result = x * y;
        else if (operation == '/') {
            if (y != 0)
                result = x / y;
            else {
                System.out.println("You can't divide by 0!");
                valid = false;
            }
        }
        else if (operation == '%') {
            if (y != 0)
                result = x % y;
            else {
                System.out.println("You can't divide by 0!");
                valid = false;
            }
        }
        else { //execute the block
            valid = false;
            System.out.println("unrecognised operation");
        }
        if (valid)
            System.out.println (x + "" + operation + y + " = " + result);
    }
}