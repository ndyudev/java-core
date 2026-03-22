package javacore.OOP.Phan1.VD30.Bill;

public class ManagerBill {
    public static void main(String[] args) {
        Bill bill = new Bill("Cafe", "9/2/2025", 10);
        bill.printNameProduct();
        bill.printGiaProduct();
        bill.printDate();
    }
}
