package javacore.OOP.Abstract.Video45;

public class Oto extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public Oto(String tenLoaiPhuongTien, String loaiNhienLieu) {
        super(tenLoaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 100;
    }
}
