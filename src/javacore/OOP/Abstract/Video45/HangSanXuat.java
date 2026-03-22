package javacore.OOP.Abstract.Video45;

public class HangSanXuat {
    private String tenHangSanXuat, tenQuocGia;

    public HangSanXuat() {}

    public HangSanXuat(String tenQuocGia, String tenHangSanXuat) {
        this.tenQuocGia = tenQuocGia;
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getTenQuocGia() {
        return tenQuocGia;
    }

    public void setTenQuocGia(String tenQuocGia) {
        this.tenQuocGia = tenQuocGia;
    }
}
