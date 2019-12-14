public class Lesson14 {
    public static void main(String[] argv) {
        System.out.println(pigLatin("ruby"));
        System.out.println(translateSentence("I am currently taking Fundamental Java"));
        System.out.println(isPalindrome1("Litongggg"));
        System.out.println(isPalindrome2("tacoCAT"));
    }
    private static String pigLatin(String word) {
        word = word.toLowerCase();
        if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u' || word.charAt(0) == 'y') {
            return word + "-ay";
        }
    return word.substring(1) + "-" + word.charAt(0) + "ay";
    }

    private static String translateSentence(String sent) {
        String translatedSent = "";
        while (true) {
            int spacePos = sent.indexOf(' ');
            if (spacePos == -1) {
                break;
            }
            String word = sent.substring(0, spacePos);
            String translatedWord = pigLatin(word);
            sent = sent.substring(spacePos + 1);
            translatedSent += translatedWord + " ";

        }
        return translatedSent + pigLatin(sent);
    }

    private static boolean isPalindrome1(String word) {
        String backwardsWord = "";
        for (int i = word.length() - 1; i > -1; i--) {
            backwardsWord += word.charAt(i);
        }
        return (backwardsWord.equalsIgnoreCase(word));
    }

    private static boolean isPalindrome2(String word) {
        String backwardsWord = "";
        for (int i = 0; i < word.length(); i++) {
            backwardsWord = word.charAt(i) + backwardsWord;
        }
        return (backwardsWord.equalsIgnoreCase(word));
    }
}
