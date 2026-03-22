package javacore.exception;

public class TestExeption {

    public static void main(String[] args) {
        GenericManager<Employee> emp = new GenericManager<>();
        try {
            emp.firtsItemList();
        } catch (EmptyListExeption e) {
            System.err.println("Lỗi nghiệp vụ:" + e.getMessage());
        }
    }
}
