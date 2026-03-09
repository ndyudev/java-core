package javacore.OOP.Phan1.VD31.Student;

import java.util.Scanner;

public class Student {
    private String idClass;
    private int memberClass;
    private int thuHang;

    public Student() {
        this.idClass = "";
        this.memberClass = 0;
        this.thuHang = 0;
    }

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap id lop: ");
        this.idClass = sc.nextLine();
        System.out.println("Nhap so luong thanh vien: ");
        this.memberClass = sc.nextInt();
        System.out.println("Nhap thu hang lop: ");
        this.thuHang = sc.nextInt();
    }

    public void xuatThongTin() {
        System.out.println("ID Lop: " + this.idClass);
        System.out.println("So luong thanh vien: " + this.memberClass);
        System.out.println("Nhap thu hang lop: " + this.thuHang);
    }
}
