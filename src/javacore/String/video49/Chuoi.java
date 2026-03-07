package javacore.String.video49;

import java.util.Scanner;

public class Chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi:");
        String input = sc.nextLine();

        System.out.println("\n🔠 Chuỗi bạn vừa nhập: " + input);

        // 1. Độ dài chuỗi
        System.out.println("\n👉 Độ dài chuỗi: " + input.length());

        // 2. In từng ký tự
        System.out.println("\n👉 Từng ký tự trong chuỗi:");
        for (int i = 0; i < input.length(); i++) {
            System.out.println("Ký tự tại vị trí " + i + ": " + input.charAt(i));
        }

        // 3. Viết hoa, viết thường
        System.out.println("\n🔠 Viết hoa: " + input.toUpperCase());
        System.out.println("🔡 Viết thường: " + input.toLowerCase());

        // 4. Cắt chuỗi
        if (input.length() >= 5) {
            System.out.println("\n✂️ Cắt từ 0 đến 4: " + input.substring(0, 5));
        }

        // 5. Xóa khoảng trắng
        System.out.println("\n🧹 Trim chuỗi: '" + input.trim() + "'");

        // 6. So sánh chuỗi
        System.out.println("\n🆚 So sánh với 'hello': " + input.equals("hello"));
        System.out.println("🆚 So sánh (không phân biệt hoa/thường) với 'hello': " + input.equalsIgnoreCase("hello"));

        // 7. Kiểm tra chứa chuỗi
        System.out.println("\n🔍 Chuỗi có chứa 'java'? " + input.contains("java"));

        // 8. Tìm vị trí từ
        System.out.println("📌 Vị trí đầu tiên của chữ 'a': " + input.indexOf("a"));

        // 9. Thay thế chuỗi
        System.out.println("🔁 Thay 'a' bằng 'A': " + input.replace("a", "A"));

        // 10. Tách chuỗi (split)
        System.out.println("\n🔪 Tách chuỗi thành mảng:");
        String[] words = input.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Từ " + (i + 1) + ": " + words[i]);
        }

        // 11. Dùng getChars (copy chuỗi con vào mảng ký tự)
        char[] buffer = new char[10];
        try {
            input.getChars(0, Math.min(5, input.length()), buffer, 0);
            System.out.print("\n📦 Mảng ký tự từ getChars: ");
            for (char c : buffer) {
                if (c != '\u0000') { // không in ký tự rỗng
                    System.out.print(c + " ");
                }
            }
        } catch (Exception e) {
            System.out.println("❌ Lỗi khi dùng getChars: " + e.getMessage());
        }

        sc.close();
    }
}
