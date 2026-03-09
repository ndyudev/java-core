package javacore.exception;

import java.util.Scanner;

public class EmployeeManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService employeeService = new EmployeeService();
        int choice = -1;

        do {
            System.out.println("\n--- QUẢN LÝ NHÂN VIÊN (LAB 4) ---");
            System.out.println("1. Thêm nhân viên viên");
            System.out.println("2. Tìm nhân viên");
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
                        System.out.print("Nhập salary: ");
                        double salary = Double.parseDouble(sc.nextLine());

                        Employee e = new Employee(id, name, salary);
                        employeeService.addEmployee(e);
                        break;
                    case 2:
                        System.out.print("Nhập id nhân viên muốn tìm:");
                        String idFind = sc.nextLine();
                        Employee eFind = new Employee();
                        eFind = employeeService.findById(idFind);
                        if (eFind != null) {
                            System.out.println("tìm thấy nhân viên:" + eFind);
                        } else {
                            System.out.println("Nhân viên không tồn tại");
                        }
                        break;
                    case 0:
                        System.out.println("Tạm biệt!");
                        break;
                    default:
                        System.out.println("Chọn sai, vui lòng chọn lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập đúng số của lựa chọn!");
                choice = -1;
            } catch (DuplicateEmployeeException e) {
                System.out.println("Lỗi nghiệp vụ: " + e.getMessage());
                choice = -1;
            } catch (InvalidSalaryException e) {
                System.out.println("Lỗi nghiệp vụ:" + e.getMessage());
            } catch (Exception e) {
                // Bắt các lỗi không xác định khác
                System.out.println("Đã xảy ra lỗi hệ thống: " + e.getMessage());
                choice = -1;

            }
        } while (choice != 0);

    }
}
