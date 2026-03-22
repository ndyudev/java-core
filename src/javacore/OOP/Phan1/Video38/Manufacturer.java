package javacore.OOP.Phan1.Video38;

public class Manufacturer {
    private String nameManufacturer;
    private Country country;

    public Manufacturer() {}

    public Manufacturer(String nameManufacturer, Country country) {
        this.nameManufacturer = nameManufacturer;
        this.country = country;
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "nameManufacturer='" + nameManufacturer + '\'' +
                ", country=" + country +
                '}';
    }
}
