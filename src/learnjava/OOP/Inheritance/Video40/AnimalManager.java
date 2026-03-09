package javacore.OOP.Inheritance.Video40;

public class AnimalManager {
    public static void main(String[] args) {
        Animal anm = new Animal("Thư");

        Dog dg = new Dog("Duy", 10);

        BabyDog bbdg = new BabyDog("Nhi", 3, "Duy");

        Cat cat = new Cat("Tiên", 5);

        anm.eat();

        dg.Bark();
        dg.eat();

        bbdg.weep();
        bbdg.eat();
        bbdg.Bark();
        cat.meow();
    }
}
