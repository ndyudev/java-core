package javacore.Lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lesson1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList(
                "An", "Binh", "Chương", "Duyy", "Anh Tuấn", "Phương Thảo", "Linh", "Hoàng", "Khánh", "Minh"
        ));

        System.out.println("- Danh sách tên:");
        names.forEach(name -> System.out.println("name:" + name));
        System.out.println("- Danh sách tên trên 5 ký tự:");
        names.stream().filter(n -> n.length() > 5).forEach(System.out::println);
        
        System.err.println("Sắp xếp a - z");
        names.sort((s1 , s2) -> s1.compareTo(s2));
        names.forEach(name -> System.out.println(name));
        
        System.err.println("Sắp xếp đô dài tăng dần");
        names.sort(Comparator.comparingInt(String::length));
        names.forEach(System.out::println);
    }
}
