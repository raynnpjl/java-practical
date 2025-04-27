package Practical3;

public class Sphere {
    private double radius;

    public Sphere(double newRadius) {
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public float calculateArea() {
        return (float) (4*Math.PI*(Math.pow(radius, 2)));
    }

    public float calculateVolume() {
        return (float) (4/3*(Math.PI*(Math.pow(radius, 3))));
    }
}
