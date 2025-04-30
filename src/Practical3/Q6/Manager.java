package Q6;

public class Manager extends Employee{
    private double profit;

    public Manager(String name, double baseSalary, double profit) {
        super(name, baseSalary);
        this.profit = profit;
    }

    public double calcSalary() {
        return super.getBaseSalary() + this.profit*0.10;
    }
}
