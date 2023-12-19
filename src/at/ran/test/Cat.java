package at.ran.test;

public class Cat implements Animal{
    private String name;

    public Cat (String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("The Cat is running");
    }

    @Override
    public String getName() {
        return name;
    }

}
