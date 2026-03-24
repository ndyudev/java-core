package javacore.OOP.Inheritance.Video39;

public class Student extends Human {
    private String idStudent;
    private String classStudent;

    public Student(String name, int age, String classStudent, String idStudent) {
        super(name, age);
        this.classStudent = classStudent;
        this.idStudent = idStudent;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    public String getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent='" + idStudent + '\'' +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }

    public void Learn() {
        System.out.println("Learn Student");
    }
}
