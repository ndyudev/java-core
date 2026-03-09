package javacore.exception;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> list = new ArrayList<>();
    
    public void addStudent(Student s) {
        if (s.getId() == null || s.getId().trim().isEmpty()) {
            throw new IllegalArgumentException("Lỗi: ID không được để trống!");
        }
        if (s.getName() == null || s.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Lỗi! Tên không được để trống!");
        }
        if (s.getGpa() < 0 || s.getGpa() > 4) {
            throw new IllegalArgumentException("Lỗi! GPA phải nàm trong khoảng từ 1 đến 4");
        }
        list.add(s);
        System.out.println("Thêm sinh viên thành công");
    }
    
    public void displayAll() {
        if (list.isEmpty()) {
            System.out.println("Danh sách đang trống!");
        } else {
            list.forEach(Student::inThongTin);
        }
    }
}
