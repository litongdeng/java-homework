public class Lesson13Homework {
    public static void main (String[] argv) {
        String num1 = "(XXX)XXX-XXXX";
        String num2 = "9999999999";
        String num3 = "(345)987-0090";

        System.out.println(phoneNumber(num1)); // false
        System.out.println(phoneNumber(num2)); // false
        System.out.println(phoneNumber(num3)); // true

        System.out.println();

        System.out.println(getPrevAlphabet('a')); // z
        System.out.println(getPrevAlphabet('z')); // y
        System.out.println(getPrevAlphabet('r')); // q

        System.out.println();

        System.out.println(getNextTwoAlphabets('a')); // b c
        System.out.println(getNextTwoAlphabets('z')); // a b
        System.out.println(getNextTwoAlphabets('h')); // i j
    }
    static boolean phoneNumber(String phoneNum) {
        if (phoneNum.length() != 13) {
            return false;
        } else if (!phoneNum.substring(0,1).equals("(")) {
            return false;
        } else if (!phoneNum.substring(4,5).equals(")")) {
            return false;
        } else if (!phoneNum.substring(9,10).equals("-")) {
            return false;
        }

        String firstThree = phoneNum.substring(1,4);
        String secondThree = phoneNum.substring(6,9);
        String lastFour = phoneNum.substring(10);

        String onlyDigit = firstThree + secondThree + lastFour;

        for (int i = 0; i < onlyDigit.length(); i++) {
            if (!(onlyDigit.charAt(i) >= '0' && onlyDigit.charAt(i) <= '9')) {
                return false;
            }
        }
        return true;
    }

    static char getPrevAlphabet(char letter) {
        if (letter == 'A' || letter == 'a') {
            return 'z';
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int position = alphabet.indexOf(letter);
        if (position != -1) {
            return alphabet.charAt(position - 1);
        } else {
            return ' ';
        }
    }

    static String getNextTwoAlphabets(char letter) {
        if (letter == 'Z' || letter == 'z') {
            return "a b";
        }
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int position = alphabet.indexOf(letter);
        if (position != -1) {
            return (alphabet.charAt(position + 1) + " " + alphabet.charAt(position + 2));
        } else {
            return " ";
        }
    }
}
