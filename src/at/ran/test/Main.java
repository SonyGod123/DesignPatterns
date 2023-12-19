package at.ran.test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PetStore> petStore = new ArrayList<>();


            Person person = new Person("Jan", "Tschabrun");
            System.out.println(person.printName());
            Cat cat = new Cat("bobby");
            System.out.println(cat.getName());
            petStore.add(cat);

            Dog dog = new Dog("Tobias");
            System.out.println(dog.getName());
            petStore.add(dog);


            for (PetStore element : petStore) {
                System.out.println(element);
            }

        }
    }



