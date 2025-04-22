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
public class Q2 {
    public static void main(String[] args) {
        
        String ph_lvl = JOptionPane.showInputDialog(
        null,
        "Enter pH level of the tested water:",
        "Input",
        JOptionPane.QUESTION_MESSAGE);
        
        int int_ph_lvl = Integer.parseInt(ph_lvl);
        
        if (int_ph_lvl < 7) {
            JOptionPane.showMessageDialog(
                null,
                "Your aquarium water is acidic",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else if (int_ph_lvl == 7) {
            JOptionPane.showMessageDialog(
                null,
                "Your aquarium water is neutral",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        else {
            JOptionPane.showMessageDialog(
                null,
                "Your aquarium water is alkaline",
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
