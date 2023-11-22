package Pattern.observer;

import java.awt.*;
import java.util.List;
import java.util.ArrayList;



public class Haussteuerung{

private List<Observer>observers;
private Thermometer t1 = new Thermometer(20);
private Heizregler h1 = new Heizregler();
private Markiesenregler m1 = new Markiesenregler();

public void startHaussteuerung(){
    this.observers = new ArrayList<>();
    this.observers.add(h1);
    this.observers.add(m1);
    t1.setTemperature(21);

    if (t1.getTemperature()>20){
        for (Observer observer : this.observers){
            observer.inform();
        }
    }
}

    public static void main(String[] args) {
        Haussteuerung hs = new Haussteuerung();
        hs.startHaussteuerung();
    }

}
