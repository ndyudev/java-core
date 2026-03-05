package JavaCore.exception;

public class GenericManagement {

    public static void main(String[] args) {
        GenericManager<Student> studentManager = new GenericManager<>();

        studentManager.add(new Student("SV001", "Duy", 3.7));
        studentManager.add(new Student("S02", "Nguyen Van Teo", 2.5));

        studentManager.displayAll();
        System.out.println("So luong sinh vien: " + studentManager.getSize());

        GenericManager<Employee> employeeManager = new GenericManager<>();
        employeeManager.add(new Employee("E01", "Truong Ba Chi", 15000000));
        employeeManager.add(new Employee("E02", "Ta Dinh Phong", 20000000));

        employeeManager.displayAll();
        System.out.println("Số lượng NV: " + employeeManager.getSize());
    }
}
