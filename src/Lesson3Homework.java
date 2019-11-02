import java.util.Scanner;

public class Lesson3Homework {
    public static void main (String[] argv) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What time is it? Please enter the time in 24-hour format. ");
        int time = sc.nextInt();
        if (time > 6 && time <= 12)
            System.out.println("Good morning!");
        else if (time > 12 && time <= 17)
            System.out.println("Good afternoon!");
        else if (time > 17 && time <=22)
            System.out.println("Good evening.");
        else if (time > 22 && time <= 23)
            System.out.println("Have a good sleep.");
        else if (time >= 0 && time <= 6)
            System.out.println("Have a good sleep.");
            //if there was another command here you would need a {} to wrap the block
        else
            System.out.println("Please enter a valid time.");
    }
}
