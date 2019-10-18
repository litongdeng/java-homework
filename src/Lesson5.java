public class Lesson5 {
    public static void main (String argv []) {
        // [1...6] inclusive 1 & 6
        // [1...6) interval notation - not including 6a

        //generating a random number
        //generate a number in [0...1) (0 through 0.999999...)
        for (int i = 1; i <= 10; i++) {
            // math.random always generates a double number
            int d = (int)(Math.random() * 6 + 1); // a double number in the range of 0 to 6 not including 6
            System.out.println(d);
        }
    }
}
