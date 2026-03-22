package javacore.OOP.Abstract.Video45;

public class MayBay extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public MayBay(String tenLoaiPhuongTien, String loaiNhienLieu) {
        super(tenLoaiPhuongTien);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 500;
    }


    public void catCanh() {
        System.out.println("Cất cánh");
    }

    public void haCanh() {
        System.out.println("Hạ cánh");
    }

    @Override
    public void batDau() {
        super.batDau();
    }
}
