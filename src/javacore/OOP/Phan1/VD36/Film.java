package javacore.OOP.Phan1.VD36;

public class Film {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private MyDate ngayChieu;

    public Film(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, MyDate ngayChieu, double giaVe) {
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.hangSanXuat = hangSanXuat;
        this.ngayChieu = ngayChieu;
        this.giaVe = giaVe;
    }

    public String getTenPhim() {
        return tenPhim;
    }

    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public double getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }

    public MyDate getNgayChieu() {
        return ngayChieu;
    }

    public void setNgayChieu(MyDate ngayChieu) {
        this.ngayChieu = ngayChieu;
    }

    public boolean kiemTraGiaVeReHon(Film filmKhac) {
        return giaVe < filmKhac.giaVe;
    }

    public String layTenHangSanXuat() {
        return this.getTenPhim();
    }

    public double layGiaSauKhiKhuyenMai(double x) {
        return this.giaVe * 1 - ( x / 100);
    }
}
