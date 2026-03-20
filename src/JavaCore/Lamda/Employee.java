package JavaCore.Lamda;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() { return name; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return String.format("ID: %d | Tên: %-12s | Lương: %,.0f", id, name, salary);
    }
}