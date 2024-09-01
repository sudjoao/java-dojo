package exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        runPersonExercise();
    }

    private static void runPersonExercise() {
        Person firstPerson = new Person("Joao", 22);
        Person secondPerson = new Person("Maria", 24);
        Person thirdPerson = new Person("Jose", 21);
        ArrayList<Person> people = new ArrayList<>();
        people.add(firstPerson);
        people.add(secondPerson);
        people.add(thirdPerson);
        System.out.printf("We have %d persons on our database\n", people.size());
        System.out.printf("The first person in list is %s\n", people.getFirst());
        System.out.printf("The complete list is: %s\n", people);
    }
}
