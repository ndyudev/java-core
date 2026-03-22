package javacore.OOP.Phan1.Video38;

public class Computer {
    private Date dateProduction;
    private Double price;
    private Manufacturer manufacturer;
    private String timeGuarantee;

    public Computer() {}

    public Computer(Date dateProduction, Double price, Manufacturer manufacturer, String timeGuarantee) {
        this.dateProduction = dateProduction;
        this.price = price;
        this.manufacturer = manufacturer;
        this.timeGuarantee = timeGuarantee;
    }

    public Date getDateProduction() {
        return dateProduction;
    }

    public void setDateProduction(Date dateProduction) {
        this.dateProduction = dateProduction;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTimeGuarantee() {
        return timeGuarantee;
    }

    public void setTimeGuarantee(String timeGuarantee) {
        this.timeGuarantee = timeGuarantee;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "dateProduction=" + dateProduction +
                ", price=" + price +
                ", manufacturer=" + manufacturer +
                ", timeGuarantee='" + timeGuarantee + '\'' +
                '}';
    }

    public boolean checkHigherPrice(Computer computer) {
        return this.price > computer.getPrice();
    }

    public String printNationalProduction() {
        return this.manufacturer.toString();
    }
}
