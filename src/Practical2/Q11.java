package Practical2;

import java.util.*;

public class Q11 {

    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, Integer> grades = new HashMap<>();
        grades.put("A", 4);
        grades.put("B", 3);
        grades.put("C", 2);
        grades.put("D", 1);

        int counter = 1;
        int totalScore = 0;
        int totalCU = 0;

        System.out.print("Enter grade for module #1 (or enter 0 to stop) :  ");
        String userInputGrade = input.nextLine();

        if (userInputGrade.equals("0")) {
            System.out.print("Please enter atleast a grade for GPA to be calculated.");
            System.exit(0);
        };

        System.out.print("Enter credit units for module #1 : ");
        String userInputCU = input.nextLine();

        int intUserInputCU = Integer.parseInt(userInputCU);

        totalScore += grades.get(userInputGrade)*intUserInputCU;
        totalCU += intUserInputCU;

        while (!userInputGrade.equals("0")) {
            counter += 1;
            System.out.printf("Enter grade for module #%d (or enter 0 to stop) :  ", counter);
            userInputGrade = input.nextLine();

            if (userInputGrade.equals("0")) {
                break;
            }

            System.out.printf("Enter credit units for module #%d : ", counter);
            userInputCU = input.nextLine();
    
            intUserInputCU = Integer.parseInt(userInputCU);
    
            totalScore += grades.get(userInputGrade)*intUserInputCU;
            totalCU += intUserInputCU;
        }

        double GPA = (double) totalScore/totalCU;

        System.out.printf("Your total Credit units: %d\nYour GPA is %.2f", totalCU, GPA);
    }
}
