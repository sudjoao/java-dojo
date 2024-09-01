package exercise3;

public class Dog extends Animal {
    String owner;
    public Dog(String owner, String name) {
        super(name);
        this.owner = owner;
    }

    public void bark(){
        System.out.println("Woof woof");
    }

    @Override
    public String toString() {
        return super.toString() + " owned by %s".formatted(owner);
    }
}
