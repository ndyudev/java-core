package JavaCore.exception;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee e) {
        if (e.getSalary() < 0) {
            throw new InvalidSalaryException("Lỗi! Lương phải lớn hơn 0");
        }
        for (Employee emp : list) {
            if (emp.getId().equalsIgnoreCase(e.getId())) {
                throw new DuplicateEmployeeException("Lỗi: Id đã tồn tại!");
            }
        }
        list.add(e);
        System.out.println("Thêm nhân viên thành công!");
    }

    public Employee findById(String id) {
        return list.stream().filter(emp -> emp.getId().equalsIgnoreCase(id)).findFirst().orElse(null);
    }
}
