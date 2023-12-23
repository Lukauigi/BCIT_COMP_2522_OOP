package ca.self.practice;

/**
 * Warm up.
 *
 * @author LukeB
 * @version October 2021
 */
public class WarmUp {

    public static int getSumOfTwoLargest(int[] arrayOfIntegers) {
        if (arrayOfIntegers.length == 1) {
            return arrayOfIntegers[0];
        } else if (arrayOfIntegers.length == 2) {
            return arrayOfIntegers[0] + arrayOfIntegers[1];
        } else {
            int largest;
            int secondLargest;

            if (arrayOfIntegers[0] >= arrayOfIntegers[1]) {
                largest = arrayOfIntegers[0];
                secondLargest = arrayOfIntegers[1];
            } else {
                secondLargest = arrayOfIntegers[0];
                largest = arrayOfIntegers[1];
            }


            for (int index : arrayOfIntegers) {
                if (index > largest) {
                    secondLargest = largest;
                    largest = index;
                } else {
                    if (index > secondLargest) {
                        secondLargest = index;
                    }
                }
            }
            return largest + secondLargest;
        }
    }

    public static void main(String[] args) {
        int[] firstTest = {2, 1}; // 3
        int[] secondTest = {2, 4, 6, 8, 10, 12, 14}; // 26
        int[] thirdTest = {14, 12, 10, 8, 10, 12, 14}; // 28
        int[] fourthTest = {8, 8, 8, 8, 8}; // 16

        System.out.printf("%d\n", getSumOfTwoLargest(firstTest));
        System.out.printf("%d\n", getSumOfTwoLargest(secondTest));
        System.out.printf("%d\n", getSumOfTwoLargest(thirdTest));
        System.out.printf("%d\n", getSumOfTwoLargest(fourthTest));
    }

}
