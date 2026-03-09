package javacore.Overriding;

public class Bird extends Animal {
    public Bird() {}

    public Bird(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("Chíp chíp");
    }

    @Override
    public void eat() {
        System.out.println("Sâu");
    }
}
