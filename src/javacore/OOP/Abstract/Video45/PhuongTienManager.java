package javacore.OOP.Abstract.Video45;

public class PhuongTienManager {
    public static void main(String[] args) {
        HangSanXuat VietNam = new HangSanXuat("Viet Nam", "Bamboo");
        HangSanXuat NhatBan = new HangSanXuat("Nhật Bản", "StarFlyer");
        HangSanXuat Duc = new HangSanXuat("Đức", "Condor");
        PhuongTienDiChuyen mayBay = new MayBay("Máy Bay", "Xăng");
        PhuongTienDiChuyen Oto = new Oto("Oto", "Xăng");
        PhuongTienDiChuyen XeDap = new XeDap("Xe Đạp");

        System.out.println("Lấy hảng sản xuất Việt Nam:" + VietNam.getTenHangSanXuat());

        System.out.println("Bắt đầu:");

        mayBay.batDau();

        System.out.println("Lấy vận tốc: " + Oto.layVanToc());
    }
}
