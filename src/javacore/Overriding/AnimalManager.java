package javacore.Overriding;
/*
-- Tại sao phải cần overriding:
+ Vì các phương thức trong lớp cha nhiều lúc nó phù hợp với lớp con này nhưng lại không phù
hợp với lớp con khác nên chúng ta phải dùng overriding để ghi đè phương thức
 */
public class AnimalManager {
    public static void main(String[] args) {
        Dog dog = new Dog("Tèo");
        Cat cat = new Cat("Sen");
        Bird bird = new Bird("Tủn");

        dog.eat();
        dog.makeSound();
        cat.eat();
        bird.eat();
        cat.makeSound();
        bird.makeSound();
    }
}
