package javacore.exception;

import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        int choice;

        do {
            System.out.println("\n--- QUẢN LÝ SINH VIÊN (LAB 4) ---");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            try {
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Nhập ID: ");
                        String id = sc.nextLine();
                        System.out.print("Nhập tên: ");
                        String name = sc.nextLine();
                        System.out.print("Nhập GPA: ");
                        double gpa = Double.parseDouble(sc.nextLine());

                        Student s = new Student(id, name, gpa);
                        service.addStudent(s);
                        break;
                    case 2:
                        service.displayAll();
                        break;
                    case 0:
                        System.out.println("Tạm biệt!");
                        break;
                    default:
                        System.out.println("Chọn sai, vui lòng chọn lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập số cho Menu và GPA!");
                choice = -1;
            } catch (IllegalArgumentException e) {      
                System.out.println(e.getMessage());
                choice = -1;
            }
        } while (choice != 0);
    }
}
