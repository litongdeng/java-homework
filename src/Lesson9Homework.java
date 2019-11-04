public class Lesson9Homework {
    public static void main(String[] argv) {
        int[] intArray = {39, 7, 24, 8, 99, 12};
        System.out.println(isInArray(39, intArray));
        System.out.println(isInArray(48737, intArray));

        System.out.println(); // skipping a line in between

        System.out.println(intInAlphabet(-99));

        System.out.println(); // skipping a line in between

        char[] inputArray = new char[] {'a', 'b', 'c', 'd', 'e'};
        char[] newArray = halfArray(inputArray);
        for(int x = 0; x < newArray.length; x++) {
            System.out.print(newArray[x]);
        }
    }

    static boolean isInArray(int num, int[] a) {
        for (int i = 0; i < a.length; i++) {
            int n = a[i];
            if (n == num) {
                return true;
            }
        }
        return false;
    }

    static char intInAlphabet(int value) {
        if (value - 26 <= 0) {
            return (char) ('a' + value - 1);
        } else {
            return '!';
        }
    }

    static char[] halfArray(char[] inputArray) {
        int newArrayLength;

        if (inputArray.length % 2 == 0) {
            newArrayLength = inputArray.length / 2;
        } else {
            newArrayLength = inputArray.length / 2 + 1;
        }
        char[] updatedArray = new char[newArrayLength];
        for (int i = 0; i < newArrayLength; i++) {
            updatedArray[i] = inputArray[i];
        }
        return updatedArray;
    }

}

