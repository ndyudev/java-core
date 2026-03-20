package JavaCore.exception;

public class Student {
    private String id;
    private String name;
    private double gpa;

    public Student() {}

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // inThongTin() theo yêu cầu 
    public void inThongTin() {
        System.out.println(this.toString());
    }

    // Các Getter và Setter (Duyy nhớ thêm đủ setter để dùng nhé)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getGpa() { return gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }

    @Override
    public String toString() {
        return "Student: [ID=" + id + ", Name=" + name + ", GPA=" + gpa + "]";
    }
}