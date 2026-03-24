package javacore.OOP.Phan1.VD35;

public class TacGia {
    private String tenTacGia;
    private myDate ngaySinh;

    public TacGia(String tenTacGia, myDate ngaySinh) {
        this.tenTacGia = tenTacGia;
        this.ngaySinh = ngaySinh;
    }

    public myDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(myDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }
}
