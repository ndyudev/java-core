package javacore.OOP.Phan1.VD30;

public class myDate {
    private int day;
    private int month;
    private int year;

    // Dựa vào bản vẽ myDate để tạo ngày thág năm thực tế
    public myDate(int d, int m, int y) {
        this.day = d;
        this.month = m;
        this.year = y;
    }

    public void printDay() {
        System.out.println("Ngày:" + day);
    }

    public void printMonth() {
        System.out.println("Tháng:" + month);
    }

    public void printYear() {
        System.out.println("Năm:" + year);
    }

    public void printDate() {
        System.out.println("Ngày:" + day + "\n Tháng:" + month + "\n Năm:" + year);
    }
}
