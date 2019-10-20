public class Lesson8 {
    public static void main(String argv[]) {
        int studentNum = (int) (Math.random() * 9 + 1);
        String[] studentNames;

        studentNames = new String[10];
        String[] names2 = {"Litong", "Emanuel", "Benny", "Everest", "Winston", "Casey", "Luke", "Woody", "Tony", "Bryan"};

        int[] numList = {3, 5, 11111, 100, 7, 8, 10};
//        System.out.println(names2[1]);

//        for (int i = 0; i < names2.length; i++) {
//            System.out.println(names2 [i]);
//        }

        System.out.println(names2[studentNum] + ", you have been selected to answer the question!");
//        int sum = 0;
//        for (int i = 0; i < numList.length; i++) {
//            sum += numList[i];
//        }
//        System.out.println(sum);
//
//        for (int index = names2.length - 1; index >= 0; index--) {
//            System.out.println(names2[index]);
//        }

        // Practice #3 - print out all odd numbers in the array
        for (int index = numList.length - 1; index >= 0; index--) {
            if (numList[index] % 2 != 0) {
                System.out.print(numList[index] + " ");
            }
        }
        System.out.println();
        //Practice 4 - sout every other name
        for (int i = 0; i < names2.length; i++) {
            if (i % 2 == 0) {
                System.out.print(names2[i] + ' ');
            }
        }
        System.out.println();
        for (int i = 0; i < names2.length; i += 2) {
            System.out.print(names2[i] + " ");
        }
        System.out.println();

        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numList.length; i++) {
            int num = numList[i];
            if (num > max) {
                max = num; // new high
            }
            if (num < min) {
                min = num; // new low
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}