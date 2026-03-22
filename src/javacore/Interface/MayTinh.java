package javacore.Interface;

import java.util.Scanner;

public class MayTinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử mảng
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();

        // Khởi tạo mảng và nhập dữ liệu
        double[] arr = new double[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập giá trị cho arr[%d]: ", i);
            arr[i] = sc.nextDouble();
        }

        // Tính toán cộng đơn giản
        MayTinhVinaCal500MS mtvnc500ms = new MayTinhVinaCal500MS();
        System.out.println("Kết quả cộng 5.5 + 7.7: " + mtvnc500ms.Cong(5.5, 7.7));

        // Sắp xếp mảng
        SapXepChon sxc = new SapXepChon();

        // Sắp xếp tăng
        sxc.sapXepTang(arr);
        System.out.println("Mảng sau khi sắp xếp tăng:");
        for (double v : arr) {
            System.out.printf("%.2f ", v);
        }

        // Sắp xếp giảm
        sxc.sapXepGiam(arr);
        System.out.println("\nMảng sau khi sắp xếp giảm:");
        for (double v : arr) {
            System.out.printf("%.2f ", v);
        }

        sc.close();
    }
}
