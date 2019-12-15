import java.util.Scanner;

public class Lesson14Homework {
    public static void main (String[] argv) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input a String. ");
        String word = sc.nextLine();

        System.out.println(makePalindrome(word));

        System.out.println();

        System.out.println(makeShortestPalindrome(word));
    }
    private static boolean isPalindrome(String word) {
        String backwardsWord = "";
        for (int i = word.length() - 1; i > -1; i--) {
            backwardsWord += word.charAt(i);
        }
        return (backwardsWord.equalsIgnoreCase(word));
    }

    private static String makePalindrome(String word) {
        String backwardsWord = "";
        for (int i = word.length() - 1; i > -1; i--) {
            backwardsWord += word.charAt(i);
        }
        return word + backwardsWord.substring(1);
    }

    private static String makeShortestPalindrome(String word) {
        int palinStart = 0;
        while(!isPalindrome(word.substring(palinStart))) {
            palinStart++;
        }
        for (int i = palinStart - 1; i > -1; i--) {
            word += word.charAt(i);
        }
        return word;
    }
}
