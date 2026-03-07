package javacore.OOP.Phan1.VD36;

public class ManagerFilm {
    public static void main(String[] args) {

        MyDate md1 = new MyDate(31, 1 , 2020);

        MyDate md2 = new MyDate(30, 4 , 2023);

        MyDate md3 = new MyDate(1, 5 , 2023);


        HangSanXuat hsx1 = new HangSanXuat("Tran Thanh Entertaiment", "Việt Nam");

        HangSanXuat hsx2 = new HangSanXuat("Ly Hai Entertaiment", "Việt Nam");

        HangSanXuat hsx3 = new HangSanXuat("Thu Trang Entertaiment", "Việt Nam");

        Film film1 = new Film("Bố Già", 2020, hsx1 , md1, 95000);

        Film film2 = new Film("Luat Mat", 2023, hsx2 , md2, 85000);

        Film film3 = new Film("Con Nhot Mot Chong", 2023, hsx3 , md3, 75000);

        System.out.println("Gia Ve Lat Mat Re Hon Ve Bo Gia Hay Khong: " + film2.kiemTraGiaVeReHon(film1));

        System.out.println("Ten hang San Xuat Bo Phim 3:" + film3.getTenPhim());

        System.out.println("Gia ve Lat Mat sau khi giam 10%:" + film2.layGiaSauKhiKhuyenMai(10));
    }
}
