package at.ran.test;

public class Dog implements Animal{

    private String name;

    public Dog(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println("The dog is running");
    }

    @Override
    public String getName() {
        return name;
    }

    
}
