public class Lesson10 {
    public static void main(String[] argv) {
//        System.out.println(factorialOf(6));
//        System.out.println(factorialOf(-2));
//        System.out.println(factorialOf(99));
//        System.out.println(factorialOf(0));
//
//        System.out.println();
//
//        System.out.println(harmonic(5));
//        System.out.println(harmonic(0));
//        System.out.println(harmonic(-2));
//
//        System.out.println();
//
//        factorsOf(-1);
//        factorsOf(101);
//        factorsOf(0);
//
//        System.out.println();

        System.out.println(sumOfDigits(999));

        System.out.println();
    }

    static int factorialOf(int num) {
        int factorial = 1;
        if (num < 0 || num > 12) {
            return -1;
        } else if (num == 0) { // this can be a separate if statement; no need for else if
            return 1;
        } else {
            int i = 1;
            while (i <= num) {
                factorial *= i;
                i++;
            }
        }
        return factorial;
    }

    static double harmonic(int n) {
        if (n <= 0) {
            return 0;
        }
        int i = 1;
        double harmonic = 0;
        while (i <= n) {
            double fraction = 1.0;
            fraction /= i;
            i++;
            harmonic += fraction;
        }
        return harmonic;
    }

    static void factorsOf(int n) {
        if (n < 0) {
            System.out.println("Invalid input.");
        } else if (n == 0) {
            System.out.println("Bro, zero has an infinite amount of factors... don't believe me? Google. ");
        } else {
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println(n);
        }
    }

    static int sumOfDigits(int n) {
        if (n < 0) {
            return -1;
        }
        int sum = 0;
        while (n != 0) {
            int singleDigit = n % 10;
            sum += singleDigit;
            n /= 10;
        }
        return sum;
    }

//    static double mystery(int n) {
//       boolean negativeCheck = true;
//    }
}
