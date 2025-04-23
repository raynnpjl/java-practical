package Practical2;

public class Q10 {
    public static void main(String[] args) {
        int[] intArray = {11, 0, 10, 2, 2};
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
