package Pattern.observer;

public class Heizregler implements Observer {

    @Override
    public void inform() {
        System.out.println("Information über Heizregler");
    }
}
