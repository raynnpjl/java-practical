package Q4;

public class FullTimeLecturer extends Lecturer {
    private String[] PTClass;
    private int[] classSize;
    private double salary;

    public FullTimeLecturer(String name, int staffID, String[] PTClass, int[] classSize, double salary) {
        super(name, staffID);
        this.PTClass = PTClass;
        this.classSize = classSize;
        this.salary = salary;
    }

    public double calcMonthlyPay() {
        return salary;
    }

    public int calcPTLunchSubsidy() {
        int totalTutee = 0;
        for (int tutee : classSize) {
            totalTutee += tutee;
        }
        return totalTutee * 10;
    }
}
