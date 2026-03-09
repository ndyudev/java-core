package javacore.Overriding;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
    }
    @Override
    public void eat() {
        System.out.println("Cá");
    }

    @Override
    public void makeSound() {
        System.out.println("Mèo méo meo");
    }
}
