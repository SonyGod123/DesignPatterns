package at.ran.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


            Person person = new Person("Jan", "Tschabrun");
            PetStore petStore = new PetStore(person);
            System.out.println(person.printName());

            Cat cat = new Cat("bobby");
            System.out.println(cat.getName());
            petStore.addAnimals(cat);



            Dog dog = new Dog("Tobias");
            System.out.println(dog.getName());
            petStore.addAnimals(dog);

            petStore.printAllAnimals();
            petStore.getOwner();




        }
    }



