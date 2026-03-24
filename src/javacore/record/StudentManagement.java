package javacore.record;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManagement {
    public static void main(String[] args) {
        Student student = new Student("SV001", null, 1.2);
        String name = student.name();
        System.out.println(name);
        List<Student> students = Arrays.asList(
                student,
                new Student("SV002", "Duy", 3.2),
                new Student("SV003", " Thư", 2.7));
        List<Student> hocbong = students.stream().filter(s -> s.gpa() >= 3.2).collect(Collectors.toList());
        hocbong.forEach(System.out::println);
    }
}
