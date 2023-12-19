package at.ran.test;

import java.util.ArrayList;
import java.util.List;

public class PetStore {
    private List<Animal> animals;
    private Person person;

    public PetStore (Person person) {
        this.animals = new ArrayList<>();
        this.person = person;
    }

    public void printAllAnimals() {
        for (Animal animal : this.animals) {
            System.out.println(animal.getName());
        }
    }
    public void addAnimals(Animal animal) {
        this.animals.add(animal);
    }

    public void getOwner() {
        System.out.println(person.printName());
    }
}
