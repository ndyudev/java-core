package javacore.OOP.Phan1.VD37;

public class SinhVienManager {
    public static void main(String[] args) {

        DateOfBirth dateOfBirth1 = new DateOfBirth("22", "7", "2006");
        DateOfBirth dateOfBirth2 = new DateOfBirth("23", "7", "2006");
        DateOfBirth dateOfBirth3 = new DateOfBirth("23", "7", "2006");

        Lop lop = new Lop("Khoa Hoc May Tinh", "SD001");
        Lop lop1 = new Lop("Khoa Hoc Du Lieu", "SD002");
        Lop lop2 = new Lop("An Toan Thong Tin", "SD003");

        Student student1 = new Student("Dyu", lop1 , "SV001", 9.4 , dateOfBirth1);
        Student student2 = new Student("Nhat Duy", lop2 , "SV002", 4.0 , dateOfBirth2);
        Student student3 = new Student("Duy Chau", lop , "SV003", 9.4 , dateOfBirth3);
        System.out.println("Student 1:" + student1);

        System.out.println("Student 2:" + student2);

        System.out.println("Student 3:" + student3);

        System.out.println("Name Faculty: " + student1.getNameFaculty());
        System.out.println("Name Faculty: " + student2.getNameFaculty());
        System.out.println("Name Faculty: " + student3.getNameFaculty());

        System.out.println("Pass or Fall of Student 3: " + student3.checkPassOrFail());
        System.out.println("Pass or Fall of Student 2: " + student2.checkPassOrFail());
        System.out.println("Pass or Fall of Student 1: " + student1.checkPassOrFail());


        System.out.println("Check Same Date Of Birth Student 2 same Student 3: " + student2.checkSameDateOfBirth(dateOfBirth3));
    }
}
