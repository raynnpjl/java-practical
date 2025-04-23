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
public class Q4_switch {
    public static void main(String[] args) {
        String strValue = JOptionPane.showInputDialog(
        null,
        "Enter a numeric value:",
        "Input",
        JOptionPane.QUESTION_MESSAGE);
        
        int numValue = Integer.parseInt(strValue);
        
        switch(numValue) {
            case 1:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = I",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = II",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = III",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = IV",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = V",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = VI",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            case 7:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = VII",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            case 8:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = VIII",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            case 9:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = IX",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            case 10:
                JOptionPane.showMessageDialog(
                null,
                "Roman Numeral Value = X",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                JOptionPane.showMessageDialog(
                null,
                "Out of Range! Pls enter a number between 1 and 10",
                "Error",
                JOptionPane.ERROR_MESSAGE);
                break;
        }
    }
}
