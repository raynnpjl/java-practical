package Q6;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new CasualEmployee("John", 10.0, 30);
        employees[1] = new CasualEmployee("Mary", 5.0, 50);
        employees[2] = new Manager("Peter", 3000.0, 5000.0);

        displaySalary(employees);
    }

    public static void displaySalary(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println("Name: "+ employee.getName());
            System.out.println("Salary: $"+ employee.calcSalary());
            if (employee != employees[employees.length-1]) {
                System.out.print("\n");
            }
        }
    }
}
