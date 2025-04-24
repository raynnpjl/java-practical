package Practical2;

import java.util.*;

// Qn10a,b
public class Q10c {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] intArray = new int[5];

        for (int i=0;i<intArray.length;i++) {
            System.out.printf("Enter value for intArray[%d] -> ", i);
            int userInput = input.nextInt();
            intArray[i] = userInput;
        }

        int highestValue = 0;

        for (int i=0;i<intArray.length;i++) {
            if (i == 0) {
                highestValue = intArray[i];
            } else {
                if (intArray[i] > highestValue) {
                    highestValue = intArray[i];
                } else {
                    continue;
                }
            }
        }

        System.out.print(String.format("Elements of int array: %d %d %d %d %d\nHighest Element: %d", intArray[0], intArray[1], intArray[2], intArray[3], intArray[4], highestValue));
    }
}
