package Practical3.Q3;

import javax.swing.JOptionPane;

public class TestHighLowGame {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
            null,
            "Welcome to the High Low Number Game"
            );
        
        HighLowGame.generateRandomNumber();

        do {
            HighLowGame.getUserInput();
            String result = HighLowGame.getResult();

            JOptionPane.showMessageDialog(
                null,
                result,
                "Message",
                JOptionPane.INFORMATION_MESSAGE);
        } while (!HighLowGame.gameEnded());
        
    }
}
