package javacore.OOP.Phan1.VD31;

public class CafeBill {
    private String tenCafe;
    private double khoiLuong;
    private double tienTrenKy;

    public CafeBill(String tenCafe, double khoiLuong, double tienTrenKy) {
        this.tenCafe = tenCafe;
        this.khoiLuong = khoiLuong;
        this.tienTrenKy = tienTrenKy;
    }

    public double tinhTongTien() {
        return this.tienTrenKy * this.khoiLuong;
    }
    public boolean kiemTraKhoiLuong(double khoiLuong) {
        return this.khoiLuong > khoiLuong;
    }
    public boolean kiemTraTongLonHon500() {
        return this.tinhTongTien() > 50000;
    }
}
