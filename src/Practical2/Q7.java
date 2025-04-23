package Practical2;
import javax.swing.*;

public class Q7 {
    public static void main(String[] args) {
        double height = height();
        double width = width();

        measureRec(height, width);
    } 

    public static double height() {
        String height = JOptionPane.showInputDialog(
        null,
        "Enter the Height",
        "Input",
        JOptionPane.QUESTION_MESSAGE);

        double heightValue = Double.parseDouble(height);

        return heightValue;
    }

    public static double width() {
        String width = JOptionPane.showInputDialog(
        null,
        "Enter the Width",
        "Input",
        JOptionPane.QUESTION_MESSAGE);

        double widthValue = Double.parseDouble(width);

        return widthValue;
    }

    public static void measureRec(double h, double w) {
        double area = h * w;
        double perimeter = h*2 + w*2;

        String measurement = String.format("Summary of Rectangle Measurements\nHeight :%.1f\nWidth :%.1f\nArea :%.1f\nPerimeter :%.1f", h, w, area, perimeter); 

        JOptionPane.showMessageDialog(
            null,
            measurement,
            "Message",
        JOptionPane.INFORMATION_MESSAGE);
    }
}
