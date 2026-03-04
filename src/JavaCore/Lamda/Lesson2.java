package JavaCore.Lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lesson2 {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee(1, "An", 16000000), new Employee(2, "Bình", 12000000),
                new Employee(3, "Anh", 20000000), new Employee(4, "Dũng", 18000000),
                new Employee(5, "Lan", 9000000), new Employee(6, "Cường", 25000000),
                new Employee(7, "Ánh", 15500000), new Employee(8, "Hoa", 14000000)
        );

        System.out.println("Lương nhân viên trên 15tr");
        list.stream().filter(e -> e.getSalary() > 15_000_000).forEach(System.out::println);

        System.out.println("Sắp xếp theo lương nhân viên giảm dần!");
        list.stream().sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary())).forEach(e -> System.out.println(e));
        System.out.println("Đếm số nhân viên có tên bắt đầu bằng chữ “A” (không phân biệt hoa \n"
                + "thường).");
        System.out.println("Lấy danh sách tên nhân viên (List<String>) từ danh sách nhân viên \n"
                + "(map).");
        List<String> listNameEmployee = list.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(listNameEmployee);
        long countA = list.stream().filter(e -> e.getName().toUpperCase().startsWith("A")).count();
        System.err.println("Số nhân viên có người bắt đầu bằng tên a or A: " + countA);
        
        // Bài 3
        double total = list.stream().mapToDouble(Employee::getSalary).sum();
        double avg = list.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        Employee maxSalary = list.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

        System.out.printf("\nTổng lương: %,.0f \nLương TB: %,.2f \nNV lương cao nhất: %s\n", total, avg, maxSalary);
    }

}
