package Q4;

public class Lecturer {
    private String name;
    private int staffID;

    public Lecturer(String name, int staffID) {
        this.name = name;
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calcMonthlyPay() {
        return 0;
    }
}
