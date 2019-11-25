import java.util.Scanner;

public class Lesson13 {
    static char getNextAlphabet(char letter) {
        if (letter == 'Z' || letter == 'z') {
            return 'a';
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int position = alphabet.indexOf(letter);
        if (position != -1) {
            return alphabet.charAt(position + 1);
        } else {
            return ' ';
        }
    }

    public static void main(String[] argv) {
        char input = ' ';
        while (true) {
            System.out.println("Please input a letter. ");
            Scanner sc = new Scanner(System.in);
            input = sc.next().charAt(0);
            System.out.println(getNextAlphabet(input));
            if (input == '#') {
                break;
            }
        }

        String thisWord = "portmanteau";
        for (int i = thisWord.length() - 1; i >= 0; i--) {
            System.out.print(thisWord.charAt(i));
        }
        String s1 = "ABCDEFBC";
        //substring = part of a string
        System.out.println();
        int len = s1.length();
        char[] charArr = new char[6];
        for (int i = 0; i <= charArr.length - 1; i++) {
            System.out.println(charArr[i]);
        }
        /* length for an array is an attribute -- no parentheses
        .length for a string is a function -- end with parentheses */
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

        String s2 = s1.substring(3, s1.length()); // .substring(from, to); from is inclusive, to is exclusive [from, to) in interval notation
        System.out.println(s2);
        String s3 = s1.substring(3); // from 3, to the end
        System.out.println(s3);

        // s1 = ABCDEFBC
        int p = s1.indexOf('A'); // 'p' stands for position
        int p1 = s1.indexOf("BC"); //returns 1; b/c it returns the earliest index of the FIRST OCCURRENCE
        int p2 = s1.indexOf("XYZ"); //returns -1 b/c it doesn't exist
        System.out.println(p + " " + p1 + " " + p2);

        String s = "Process finished with exit code 0";

        String sUpper = s.toUpperCase();

        boolean b = s.equals(sUpper);
        boolean b_ = s.equalsIgnoreCase(sUpper);
        System.out.println("b is " + b);
        System.out.println("B_ is " + b_);

        // s = "                 ";
        System.out.println("This sentence is " + s.length() + " characters long"); // spaces are characters too!!!

        while (true) {
            int spacePos = s.indexOf(" ");
            if (spacePos == -1) {
                System.out.println(s);
                break;
            }
            String word = s.substring(0, spacePos);
            System.out.println(word);
            s = s.substring(spacePos + 1);
        }
    }


}
