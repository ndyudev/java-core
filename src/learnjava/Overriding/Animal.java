package javacore.Overriding;

public class Animal {
    private String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        System.out.println("Eating...!");
    }

    public void sleep() {
        System.out.println("Sleeping...!");
    }

    public void makeSound() {
        System.out.println("...!");
    }
}
