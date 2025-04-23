package Practical2;

public class Q6 {
    public static void main(String[] args) {
        System.out.println(asterisks());
        System.out.println(information());
        System.out.println(asterisks());
    }

    public static String asterisks() {
        return String.format("%38s", "").replace(" ", "*");
    }

    public static String information() {
        String name = "Rayn Poh", age = "19", sex = "Male", location = "Singapore", maritalStatus = "Single AF";
        return String.format("\t\t%s\nAge\t\t:%s\nSex\t\t:%s\nLocation\t:%s\nMarital Status\t:%s", name, age, sex, location, maritalStatus);
    }
}
