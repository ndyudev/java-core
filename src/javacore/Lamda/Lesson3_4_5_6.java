package javacore.Lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class Lesson3_4_5_6 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Nguyễn Văn An", 16000000),
                new Employee(2, "Lê Thị Bình", 12000000),
                new Employee(3, "Trần Hữu Cảnh", 25000000),
                new Employee(4, "Phạm Minh Dũng", 18000000),
                new Employee(5, "Đỗ Mỹ Hoa", 9000000),
                new Employee(6, "Hoàng Lan Anh", 21000000),
                new Employee(7, "Vũ Quốc Bảo", 15500000),
                new Employee(8, "Phan Thùy Chi", 14000000)
        );

        double totalSalary = employees.stream().mapToDouble(Employee::getSalary).sum();
        double avgSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        Employee topSalaryEmp = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.printf("Tổng lương: %,.0f VNĐ\n", totalSalary);
        System.out.printf("Lương trung bình: %,.1f VNĐ\n", avgSalary);
        System.out.println("Nhân viên lương cao nhất: " + topSalaryEmp);

        List<Student> students = Arrays.asList(
                new Student(1, "Chau Nhat Duyy", StudentType.INTERNATIONAL, 3.9),
                new Student(2, "Nguyen Van Teo", StudentType.PART_TIME, 2.5),
                new Student(3, "Le Thi Ti", StudentType.REGULAR, 3.2),
                new Student(4, "Tran Hoang An", StudentType.INTERNATIONAL, 3.1),
                new Student(5, "Pham Minh Bao", StudentType.REGULAR, 3.8),
                new Student(6, "Vu Thu Thao", StudentType.PART_TIME, 3.6),
                new Student(7, "Doan Quoc Cuong", StudentType.INTERNATIONAL, 3.4),
                new Student(8, "Hoang My Linh", StudentType.REGULAR, 2.8),
                new Student(9, "Bui Anh Tuan", StudentType.PART_TIME, 3.0),
                new Student(10, "Nguyen Thuy Chi", StudentType.INTERNATIONAL, 3.7)
        );

        System.out.println("\n1. SV International có GPA >= 3.2:");
        students.stream()
                .filter(s -> s.getType() == StudentType.INTERNATIONAL && s.getGpa() >= 3.2)
                .forEach(System.out::println);

        System.out.println("\n2. Top 3 SV có GPA cao nhất:");
        students.stream()
                .sorted(Comparator.comparingDouble(Student::getGpa).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\n3. Tên các SV Part-time:");
        List<String> partTimeNames = students.stream()
                .filter(s -> s.getType() == StudentType.PART_TIME)
                .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(partTimeNames);

        System.out.println("\n4. Thống kê số lượng theo loại:");
        Map<StudentType, Long> countByType = students.stream()
                .collect(Collectors.groupingBy(Student::getType, Collectors.counting()));
        countByType.forEach((type, count) -> System.out.println(type + ": " + count + " SV"));

        System.out.println("\n5. GPA trung bình theo loại:");
        Map<StudentType, Double> avgGpaByType = students.stream()
                .collect(Collectors.groupingBy(Student::getType, Collectors.averagingDouble(Student::getGpa)));
        avgGpaByType.forEach((type, avg) -> System.out.printf("%-15s: %.2f\n", type, avg));

        System.out.print("\n6. Loại SV có GPA TB cao nhất: ");
        avgGpaByType.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e -> System.out.println(e.getKey() + " (" + String.format("%.2f", e.getValue()) + ")"));


    }

}
