package Practical3.Q1;

public class Trapezium {
    private double base, top, height;

    public Trapezium(double baseLength, double topLength, double heightLength) {
        base = baseLength;
        top = topLength;
        height = heightLength;
    }

    public double getBase() {
        return base;
    }

    public double getTop() {
        return top;
    }

    public double getHeight() {
        return height;
    }

    public double computeArea() {
        return (base + top) * height * 0.5;
    }
}
