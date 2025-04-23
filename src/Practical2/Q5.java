/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical2;
import java.util.Scanner;
import java.util.HashMap;

/**
 *
 * @author rayn
 */
public class Q5 {
    
    public static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int scoreNum = 0;
        double totalScore = 0;
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("A", 80);
        grades.put("B", 70);
        grades.put("C", 60);
        grades.put("D", 50);
        System.out.printf("Enter score# %d (or enter -1 to stop):", scoreNum+1);
        int userScore = input.nextInt();
        
        while (userScore != -1) {
            totalScore += userScore;
            scoreNum++;
            System.out.printf("Enter score# %d (or enter -1 to stop):", scoreNum+1);
            userScore = input.nextInt();
        }
        
        if (scoreNum == 0) {
            System.out.print("Please enter atleast one score to be graded!");
        }
        
        else {
            double avgScore = totalScore/scoreNum;
            
            if (avgScore>=grades.get("A")) {
                System.out.printf("Average Scores = %.2f Grade = A",avgScore);
            } else if (avgScore>=grades.get("B")) {
                System.out.printf("Average Scores = %.2f Grade = B",avgScore);
            } else if (avgScore>=grades.get("C")) {
                System.out.printf("Average Scores = %.2f Grade = C", avgScore);
            } else if (avgScore>=grades.get("D")) {
                System.out.printf("Average Scores = %.2f Grade = D", avgScore);
            } else {
                System.out.printf("Average Scores = %.2f Grade = F", avgScore);
            }
        }
    }
}
