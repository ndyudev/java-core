package javacore.OOP.Phan1.Video38;

public class ComputerManage {
    public static void main(String[] args) {
        Country Vietnam = new Country("Vietnam", "84");
        Country USA = new Country("USA", "82");
        Country Germany = new Country("Germany", "81");


        Manufacturer Asus = new Manufacturer("Asus", USA);
        Manufacturer Viet = new Manufacturer("Viet", Vietnam);

        Date dateProduct1 = new Date("1","1","2024");
        Date dateProduct2 = new Date("1", "6", "2021");
        Date dateProduct3 = new Date("1", "6", "2022");

        Computer ASUSVivobook = new Computer(dateProduct1, 65.5, Asus, "12 Tháng");
        Computer LenovoLOQ = new Computer(dateProduct2, 80.5, Viet, "24 Tháng");

        System.out.println(" ASUS Vivobook higher LenovoLOQ ?:" + ASUSVivobook.checkHigherPrice(LenovoLOQ));
        System.out.println(" National Production Lenovo LOQ:" + LenovoLOQ.printNationalProduction());
    }
}
