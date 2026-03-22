package javacore.String.video50;

import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
    String password = "ndyudev";

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter password:");
    String enterPassword  = sc.nextLine();
    if(enterPassword.equalsIgnoreCase(password)){
        System.out.println("Password đúng");
    } else {
        System.out.println("Wrong password");
    }

    System.out.println("Length password:" + password.length());

        // Hàm regionMatches => so sánh 1 đoạn

        String user = "ndyudev";
        String password_ndyudev = "ndyudev227";

        boolean check = user.regionMatches(3, password_ndyudev, 0, 5);

    }
}
