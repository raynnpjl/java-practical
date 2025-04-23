package Practical2;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i=0;i<100;i++) {
            if (i%2 == 0) {
                arr[i] = 1;
                System.out.printf("numberArray[%d] = 1\n", i);
            } else {
                arr[i] = 2;
                System.out.printf("numberArray[%d] = 2\n", i);
            }
        }
    }
}
