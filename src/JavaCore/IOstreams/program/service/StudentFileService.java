package JavaCore.IOstreams.program.service;

import JavaCore.IOstreams.program.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentFileService {
    public static final String FILE = "F:\\jetbrain-project\\intellij-jetbrain\\java-core\\src\\JavaCore\\IOstreams\\program\\students_data.dat";


    public void writeToFile(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(students);
            System.out.println("Ghi file thành công");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file!");
        }
    }

    // Đọc file từ danh sách student từ file
    @SuppressWarnings("unchecked")
    public List<Student> readToFile() {
        File file = new File(FILE);

        if (!file.exists()) {
            System.out.println("File không tồn tại!");
            return new ArrayList<>();
        }

        if (file.length() == 0) {
            System.out.println("File rỗng!");
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Student>) ois.readObject();

        } catch (IOException e) {
            System.out.println("Dữ liệu trong file không đúng định dạng");
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy class Student!");
        }

        return new ArrayList<>();
    }
}
