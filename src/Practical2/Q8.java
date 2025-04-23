package Practical2;
import java.util.*;

public class Q8 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter the total seconds: ");
        int s = input.nextInt();
        int hr = calHr(s);
        int min = calMin(s, hr);

        int remainingS = s - hr*3600 - min*60;

        System.out.print(String.format("\n\tTime Converter\n\nTotal Seconds:\t%d\nHours:\t\t%d\nMinutes:\t%d\nSeconds:\t%d", s, hr, min, remainingS));
    }

    public static int calHr(int s) {
        int hr = 0;
        while (s >= 3600) {
            s -= 3600;
            hr += 1;
        }

        return hr;
    }

    public static int calMin(int s, int hr) {
        int min = 0;
        int remainingSec = s - (hr * 3600);

        while (remainingSec>= 60) {
            remainingSec -= 60;
            min += 1;
        }

        return min;
    }
}
