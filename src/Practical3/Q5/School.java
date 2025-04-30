package Q5;

import javax.swing.*;

public class School {
    private Person[] persons; // used to store lecturer or student objects
    private int numOfPeople; // used to keep track of the number of people

    public School() {
        numOfPeople = 0; // School is empty initially
        populateSchool();
        displayPopulation();
    }

    public void populateSchool() {
        String inStr = JOptionPane.showInputDialog(
                null,
                "Enter number of people to create: ",
                "School",
                JOptionPane.QUESTION_MESSAGE);
        int size = Integer.parseInt(inStr);
        // create Persons array with the size
        // entered by the user
        persons = new Person[size];
        // Use a loop, in the loop:
        //
        // (1) Generate a random number from 1 to 2
        // (2) If number is 1,
        // add a student object to the persons array.
        // You will need to call createStudent() method.
        // (3) If the number is 2,
        // add a lecturer object to the persons array.
        // You will need to call createLecturer() method.
        for (int i = 0; i < persons.length; i++) {
            int randomNum = (int) (Math.random()*2) + 1;
            if (randomNum == 1) {
                createStudent();
            } else {
                createLecturer();
            }
        }
        
    }

    public void createStudent() {
        String name = JOptionPane.showInputDialog(
                null,
                "Enter Name:",
                "School - Create Student",
                JOptionPane.QUESTION_MESSAGE);
        String inStr = JOptionPane.showInputDialog(
                null,
                "Enter year of Study:",
                "School - Create Student",
                JOptionPane.QUESTION_MESSAGE);
        // Create a Student object based on the values entered
        // and store the object in the persons array
        char c = inStr.charAt(0);
        Student newStudent = new Student(name, c);
        persons[numOfPeople] = newStudent;
        numOfPeople++;
    }

    public void createLecturer() {
        // Write the code needed to create a lecturer object.
        String name = JOptionPane.showInputDialog(
            null,
            "Enter Name:",
            "School - Create Lecturer",
            JOptionPane.QUESTION_MESSAGE);
        // It will prompts the user to enter the no. of modules
        String noOfModules = JOptionPane.showInputDialog(
            null,
            "Enter the no. of modules:",
            "School - Create Lecturer",
            JOptionPane.QUESTION_MESSAGE);
        // and the module code(s) that the lecturer is teaching.
        int intNoOfModules = Integer.parseInt(noOfModules);
        String[] moduleArr = new String[intNoOfModules];
        // For example, if the lecturer teaches 3 modules,
        for (int i = 0; i < intNoOfModules; i++) {
            String module = JOptionPane.showInputDialog(
                null,
                "Enter module number "+ (i+1),
                "School - Create Lecturer",
                JOptionPane.QUESTION_MESSAGE);
            
            moduleArr[i] = module;
        }
        // it will prompt the user to enter the module code 3
        // times.
        // It then creates a Lecturer object and
        Lecturer newLecturer = new Lecturer(name, moduleArr);
        // stores in the persons array
        persons[numOfPeople] = newLecturer;
        numOfPeople++;
    }

    public void displayPopulation() {
        // Write the code to display the information about
        // each person in the school.
        // It uses the introduce() method in each class
        // to achieve this.
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("Person %d:\n", (i+1));
            persons[i].introduce();
            if ((i+1) != persons.length) {
                System.out.println("\n");
            }
        }
    }

    public static void main(String[] args) {
        School school = new School();
    }
}
