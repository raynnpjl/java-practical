package Q5;

public class Lecturer extends Person{
    private String[] modules;

    public Lecturer() {
        this.modules = null;
    }

    public Lecturer(String name, String[] modules) {
        super(name);
        this.modules = modules;
    }

    public String[] getModules() {
        return this.modules;
    }

    public String getModule(int i) {
        return this.modules[i];
    }

    public void introduce() {
        super.introduce();
        System.out.printf("I am the lecturer for the following subjects:\n");
        int counter = 1;
        for (String mod : modules) {
            System.out.printf("%d. %s\n", counter, mod);
            counter++;
        }
    }
}
