/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2; 
import java.util.Scanner;

/**
 *
 * @author rayn
 */
public class Q1 {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        final double mst = 0.20;
        final double a1 = 0.25;
        final double a2 = 0.35;
        final double gp = 0.20;
        
        System.out.print("Enter MST Scores: ");
        int user_mst = input.nextInt();
        System.out.print("Enter Assignment 1 Scores: ");
        int user_a1 = input.nextInt();
        System.out.print("Enter Assignment 2 Scores: ");
        int user_a2 = input.nextInt();
        System.out.print("Enter General Performance Scores: ");
        int user_gp = input.nextInt();
        
        double total = mst*user_mst + a1*user_a1 + a2*user_a2 + gp*user_gp;
        
        System.out.printf("Your final scores: %.2f", total);
    }
}
