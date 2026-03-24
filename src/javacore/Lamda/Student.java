package javacore.Lamda;

class Student {

    int id;
    String name;
    StudentType type;
    double gpa;

    public Student(int id, String name, StudentType type, double gpa) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.gpa = gpa;
    }

    // Getter, Setter, toString...
    public StudentType getType() {
        return type;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{"
                + "id=" + id
                + ", name='" + name + '\''
                + ", type=" + type
                + ", gpa=" + gpa
                + '}';
    }
}
