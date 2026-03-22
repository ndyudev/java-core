package javacore.OOP.Phan1.VD37;

public class Student {
    private String nameStudent;
    private String idStudent;
    private DateOfBirth dateOfBirth;
    private double pointsStudent;
    private Lop lop;

    public Student() {}

    public Student(String nameStudent, Lop lop, String idStudent, double pointsStudent, DateOfBirth dateOfBirth) {
        this.nameStudent = nameStudent;
        this.lop = lop;
        this.idStudent = idStudent;
        this.pointsStudent = pointsStudent;
        this.dateOfBirth = dateOfBirth;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public double getPointsStudent() {
        return pointsStudent;
    }

    public void setPointsStudent(double pointsStudent) {
        this.pointsStudent = pointsStudent;
    }

    public DateOfBirth getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateOfBirth dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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
                "nameStudent='" + nameStudent + '\'' +
                ", idStudent='" + idStudent + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", pointsStudent=" + pointsStudent +
                ", lop=" + lop +
                '}';
    }

    public String getNameFaculty() {
        return this.lop.getNameFaculty();
    }

    public boolean checkPassOrFail() {
        return this.pointsStudent > 5;
    }

    public boolean checkSameDateOfBirth( DateOfBirth dateOfBirth3) {
        return this.dateOfBirth.equals(dateOfBirth3);
    }
}
