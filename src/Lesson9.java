public class Lesson9 {
    public static void main(String[] argv) {
        char[] alphabet = new char[26];
        int i = 0;
        while (i < 26) {
            alphabet[i] = (char) ('a' + i);
            System.out.println(f(i));
            i++;
        }
        printArray(alphabet);
        System.out.println();

        int ar[] = {6, 1, 2, 6};
        System.out.println(isInArray(6, ar));
        System.out.println(isInArray(7, ar));
        System.out.println();
        System.out.println(isGreater('z', 'c'));

        System.out.println();

        System.out.println(isStrictlyIncreasing(alphabet));
    }

    static void printArray(char[] a) { // This function is taking in an input of type char[], with name "a"
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    /* signature of function */
    static void f2(int x, int y) {

    }

    static boolean isInArray (int num, int [ ] a ) {
        for (int i = 0; i < a.length; i++) {
            int n = a[i];
            if (n == num ) {
                return true;
            }
        }
        return false;
    }

    static int /*  must return an int  */ f(int x) { //define function
        return (int) (Math.pow(x, 2) + 3 * x + 4); // implement function
    }

    static boolean isGreater(char c1, char c2) {
        if (c1 > c2) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isStrictlyIncreasing(char[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (!isGreater(arr[i], arr[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
