package Practical3;

import javax.swing.JOptionPane;

public class HighLowGame {
    private static int randomNumber;
    private static int guess;

    public static void generateRandomNumber() {
       randomNumber =  (int) (Math.random()*100);
    }

    public static void getUserInput() {
        String userInput = JOptionPane.showInputDialog(
            null,
            "Enter your guess.",
            "Input",
            JOptionPane.QUESTION_MESSAGE);
        
        int userNumber = Integer.parseInt(userInput);

        while (userNumber > 99 || userNumber < 0) {
            JOptionPane.showMessageDialog(
                null,
                "Please only enter a number from 0-99",
                "Error",
                JOptionPane.ERROR_MESSAGE);

            userInput = JOptionPane.showInputDialog(
                null,
                "Enter your guess.",
                "Input",
                JOptionPane.QUESTION_MESSAGE);
            
            userNumber = Integer.parseInt(userInput);
        }
        
        guess = Integer.parseInt(userInput);
    }

    public static String getResult() {
        if (guess < randomNumber) {
            return guess + " is lower than the Magic Number";
        } else if (guess > randomNumber) {
            return guess + " is higher than the Magic Number";
        } else {
            return guess + " is the Magic Number";
        }
    }

    public static boolean gameEnded() {
        return randomNumber == guess;
    }
}
