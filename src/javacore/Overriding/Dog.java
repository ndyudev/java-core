package javacore.Overriding;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }
    @Override
    public void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void makeSound() {
        System.out.println("Gâu Gâu");
    }
}
