package Practical3.Q5;

public class Student extends Person{
    private char stdYear;

    public Student(String name, char stdYear) {
        super(name);
        this.stdYear = stdYear;
    }

    public char getYear() {
        return this.stdYear;
    }

    public void introduce() {
        super.introduce();
        System.out.printf("I am a year %c student.", this.stdYear);
    }
}
