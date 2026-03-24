package javacore.memory;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        // Dùng Integer để có thể chứa giá trị null
        ArrayList<Integer> points = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // 1. Nhập dữ liệu (Giả lập nhập -1 là null để test)
        for (int i = 0; i < 5; i++) {
            System.out.print("Nhập điểm môn " + (i + 1) + " (Nhập -1 nếu chưa có điểm): ");
            int input = sc.nextInt();
            if (input == -1) {
                points.add(null); // Lưu giá trị null vào Heap
            } else {
                points.add(input); // Autoboxing: int -> Integer [cite: 25]
            }
        }

        double avg = points.stream()
                .filter(p -> p != null)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("\nDanh sách điểm: " + points);
        System.out.printf("Điểm trung bình: %.2f\n", avg);

        String rank = "";
        if (avg >= 8) {
            rank = "Giỏi";
        } else if (avg >= 6.5) {
            rank = "Khá";
        } else {
            rank = "Trung bình";
        }

        System.out.println("Phân loại: " + rank);
    }
}