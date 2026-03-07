package javacore.OOP.Phan1.VD37;

public class Lop {
    private String nameFaculty;
    private String nameClass;

    public Lop(String nameFaculty, String nameClass) {
        this.nameFaculty = nameFaculty;
        this.nameClass = nameClass;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Class{" +
                "nameFaculty='" + nameFaculty + '\'' +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }
}
