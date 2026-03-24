package javacore.OOP.Abstract.Video45;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;

    public void batDau() {
        System.out.println("Bắt đầu");
    }

    public void tangToc() {
        System.out.println("Tăng Tốc");
    }

    public PhuongTienDiChuyen(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public void dungLai() {
        System.out.println("Dừng Lại");
    }

    public abstract double layVanToc();

}
