package Practical3;

public class PartTimeLecturer extends Lecturer{
    private double hourlyRate;
    private double totalHour;

    public PartTimeLecturer(String name, int staffID, double hourlyRate, double totalHour) {
        super(name, staffID);
        this.hourlyRate = hourlyRate;
        this.totalHour = totalHour;
    }

    public double calcMonthlyPay() {
        return hourlyRate * totalHour;
    }
}
