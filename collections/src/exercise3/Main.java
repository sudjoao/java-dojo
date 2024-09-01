package exercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("John", "Scooby"));
        animals.add(new Fish("Nemo"));
        animals.add(new Dog("John", "Doo"));

        animals.forEach((animal -> {
            System.out.println(animal);
            if (animal instanceof Dog dog){
                dog.bark();
            }
        }));
    }
}
