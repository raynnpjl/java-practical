/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;
import javax.swing.*;

/**
 *
 * @author rayn
 */
public class Q4 {
    public static void main(String[] args) {
        String strValue = JOptionPane.showInputDialog(
        null,
        "Enter a numeric value:",
        "Input",
        JOptionPane.QUESTION_MESSAGE);
        
        int numValue = Integer.parseInt(strValue);
        
        String[] romanList = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        
        if (numValue < 1 || numValue > 10) {
            JOptionPane.showMessageDialog(
            null,
            "Out of Range! Pls enter a number between 1 and 10",
            "Error",
            JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
            null,
            "Roman Numeral Value = " + romanList[numValue-1],
            "Message",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
