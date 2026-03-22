package javacore.Array;

import java.util.Scanner;
// Tính tổng các số trong mảng
public class SumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap gia tri phan tu tai [%d]:", i );
            arr[i] = scanner.nextInt();
        }
        for (int num : arr) {
            sum += num;
        }
        System.out.printf("Tong cac gia tri trong mang  Arr: %d", sum);
        scanner.close();
    }
}
