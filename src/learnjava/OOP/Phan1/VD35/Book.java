package javacore.OOP.Phan1.VD35;

public class Book {
    private String tenSach;
    private double giaBan;
    private int namXuatBan;
    private TacGia tacGia;

    public Book(TacGia tacGia, int namXuatBan, double giaBan, String tenSach) {
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.giaBan = giaBan;
        this.tenSach = tenSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public TacGia getTacGia() {
        return tacGia;
    }

    public void setTacGia(TacGia tacGia) {
        this.tacGia = tacGia;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public void inTenSach() {
        System.out.println("Tên Sách:" + tenSach);
    }

    public boolean kiemTraCungNamXuatBan(Book bookKhac) {
//        if(this.namXuatBan == bookKhac.namXuatBan ) {
//            return true;
//        } else {
//            return false;
//        }
        return this.namXuatBan == bookKhac.namXuatBan;
    }

    public double giaSauKhiGiam(double x) {
        return this.giaBan * ( 1 - x / 100 ); // VD: Giảm 10% thì 10 chia 100 = 0.1 ==> 1 - 0.1 = 0.9. Vậy giá nhân cho 0.9 là giảm được 10% rồi.
    }
}
