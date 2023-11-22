package Pattern.observer;

public class Markiesenregler implements Observer {

    @Override
    public void inform() {
        System.out.println("Information über Markiesenregler");
    }
}
