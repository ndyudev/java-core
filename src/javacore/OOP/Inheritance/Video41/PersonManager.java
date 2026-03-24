package javacore.OOP.Inheritance.Video41;
/* Java không có đa kế thừa
Bởi vì như bài tập tạo lớp student thì kh rõ là học sinh nước nào, thì không lẻ là nói được 3 thứ tiếng
=> Sinh ra khái niệm mới đó là interface
*/

public class PersonManager {
    public static void main(String[] args) {
        NguoiBaLan nglbl = new NguoiBaLan(2025, "Tomek");

        NguoiMy ngm = new NguoiMy(2024, "Alex");

        NguoiVietNam ngvn = new NguoiVietNam(2023, "Duy");

        nglbl.xinChao();
        ngm.xinChao();
        ngvn.xinChao();
    }
}
