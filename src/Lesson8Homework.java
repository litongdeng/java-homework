public class Lesson8Homework {
    public static void main ( String argv [ ] ) {
        // Print out the first odd number from an array or print a message telling the user that there isn't an odd number in the array
        int[] intArray = {80, 300, 24, 9, -14, 0};
        int i = 0;
        while (i < intArray.length) {
            if (intArray[i] % 2 != 0) {
                System.out.println(intArray[i]);
                break;
            }
            i++;
        }

        if (i >= intArray.length) {
            System.out.println("There isn't an odd number in this array! ");
        }
    }

}
