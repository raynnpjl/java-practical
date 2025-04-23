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
public class Q3 {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Enter your option:\n1) Metric Imperial\n2) Imperial\n>>");
        int userInput = input.nextInt();
        
        while (userInput == 1 || userInput == 2) {
            if (userInput == 1) {
                System.out.print("Enter your weight in kilograms:");
                double userWeight = input.nextDouble();
                System.out.print("Enter your height in metres (e.g. 1.75):");
                double userHeight = input.nextDouble();
                
                float userBMI = (float)(userWeight/Math.pow(userHeight, 2));
                
                if (userBMI < 18.5) {
                    System.out.printf("Your BMI is %.1f and you are Underweight", userBMI);
                    return;
                } else if (userBMI >= 18.5 && userBMI <= 24.9) {
                    System.out.printf("Your BMI is %.1f and you are Normal", userBMI);
                    return;
                } else if (userBMI >= 25 && userBMI <= 29.9) {
                    System.out.printf("Your BMI is %.1f and you are Overweight", userBMI);
                    return;
                }
            } else {
                System.out.print("Enter your weight in pounds:");
                double userWeight = input.nextDouble();
                System.out.print("Enter your height in inches:");
                double userHeight = input.nextDouble();
                
                float userBMI = (float)((userWeight*703)/Math.pow(userHeight, 2));
                
                if (userBMI < 18.5) {
                    System.out.printf("Your BMI is %.1f and you are Underweight", userBMI);
                    return;
                } else if (userBMI >= 18.5 && userBMI <= 24.9) {
                    System.out.printf("Your BMI is %.1f and you are Normal", userBMI);
                    return;
                } else if (userBMI >= 25 && userBMI <= 29.9) {
                    System.out.printf("Your BMI is %.1f and you are Overweight", userBMI);
                    return;
                }
            }
        }
        System.out.print("Please enter only either 1 or 2");
    }
}
