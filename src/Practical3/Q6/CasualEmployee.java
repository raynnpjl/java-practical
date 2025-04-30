package Q6;

public class CasualEmployee extends Employee{
    private double hourlyRate;
    private int hoursWorked;

    public CasualEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calcSalary() {
        return hourlyRate * hoursWorked;
    }
}
