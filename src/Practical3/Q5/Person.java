package Q5;

public class Person {
    private String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void introduce() {
        System.out.printf("My name is %s.\n", this.name);
    }
}
