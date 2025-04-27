package Practical3;

import javax.swing.*;

public class SphereTest {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog(
            null,
            "Enter the radius of the sphere:",
            "Sphere",
            JOptionPane.QUESTION_MESSAGE);
        
        if (userInput.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                null, 
                "No value entered.\nPlease enter again...", 
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        } else {
            double userRadius = Double.parseDouble(userInput);

            Sphere userSphere = new Sphere(userRadius);
    
            float areaSphere = userSphere.calculateArea();
    
            float volumeSphere = userSphere.calculateVolume();
    
            JOptionPane.showMessageDialog(
                null, 
                "The area of the sphere is: " + areaSphere + "\nThe volume of the sphere is: " + volumeSphere, 
                "Sphere", 
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
