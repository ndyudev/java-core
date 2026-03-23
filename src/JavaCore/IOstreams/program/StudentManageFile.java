package JavaCore.IOstreams.program;

import JavaCore.IOstreams.program.model.Student;
import JavaCore.IOstreams.program.service.StudentFileService;

import java.util.ArrayList;
import java.util.List;

public class StudentManageFile {
    public static void main(String[] args) {
        StudentFileService serviceStudent = new StudentFileService();
        // Tạo danh sach sinh viên
        List<Student> students = new ArrayList<>();

        students.add(new Student("SV001", "Châu Nhật Duy", 3.2));
        students.add(new Student("SV002", "Kim Thư", 3.2));
        // Ghi danh sách xuống file
        serviceStudent.writeToFile(students);

        // Đọc danh sách
        List<Student> list = serviceStudent.readToFile();
        if (list.isEmpty()) {
            System.out.println("Không có dữ liệu students");
        } else {
            list.forEach(System.out::println);
        }
    }
}
