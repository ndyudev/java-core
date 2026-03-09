package javacore.OOP.Phan1.VD30.Bill;

public class Bill {
    private String nameProduct;
    private double rate;
    private String date;

    public Bill(String nameProduct, String date, double rate) {
        this.nameProduct = nameProduct;
        this.date = date;
        this.rate = rate;
    }

    public void printNameProduct(){
        System.out.println("Ten san pham" + nameProduct);
    }

    public void printGiaProduct(){
        System.out.println("Gia San Pham" + rate);
    }

    public void printDate(){
        System.out.println("Ten san pham" + date);
    }
}
