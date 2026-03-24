package javacore.OOP.Phan1.VD31;

public class Main_BillCafe {
    public static void main(String[] args) {
        CafeBill cb = new CafeBill("Trung Nguyen", 1.5, 1.5);
        System.out.println("Tong tien:" + cb.tinhTongTien());
        System.out.println("Kiem tra kl lớn hơn 2:" + cb.kiemTraKhoiLuong(2));
        System.out.println("Hoa don co lon hon 500k kh:" + cb.kiemTraTongLonHon500());
    }
}
