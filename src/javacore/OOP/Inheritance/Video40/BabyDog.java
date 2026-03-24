package javacore.OOP.Inheritance.Video40;

public class BabyDog extends Dog {
    private String babyName;

    public BabyDog(String name, int age, String babyName) {
        super(name, age);
        this.babyName = babyName;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public void weep() {
        System.out.println("BabyDog weep");
    }

    @Override
    public String toString() {
        return "BabyDog{" +
                "babyName='" + babyName + '\'' +
                '}';
    }
}
