package Practical3.Q1;

public class TrapeziumUser {
    public static void main(String[] args) {
        System.out.printf("Trapezium class program started.");

        Trapezium userTrapezium = new Trapezium(6.0, 5.0, 4.0);

        System.out.printf("\n\nThis trapezium has base value %.2f", userTrapezium.getBase());
        System.out.printf("\nThis trapezium has top value %.2f", userTrapezium.getTop());
        System.out.printf("\nThis trapezium has height value %.2f", userTrapezium.getHeight());

        double trapeziumArea = userTrapezium.computeArea();
        System.out.printf("\n\nThe area of the trapezium is: %.2f", trapeziumArea);
        System.out.printf("\n\nTrapezium class program terminated.");
    }
}
