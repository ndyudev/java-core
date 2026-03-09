package javacore.OOP.Inheritance.Video41;
// Java không có đa kế thừa
public class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sleep() {
        System.out.println("I'm sleeping");
    }
}
