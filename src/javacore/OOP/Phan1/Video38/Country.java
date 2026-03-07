package javacore.OOP.Phan1.Video38;

public class Country {
    private String codeCountry;
    private String nameCountry;

    public Country() {}

    public Country(String nameCountry, String codeCountry) {
        this.nameCountry = nameCountry;
        this.codeCountry = codeCountry;
    }

    public String getCodeCountry() {
        return codeCountry;
    }

    public void setCodeCountry(String codeCountry) {
        this.codeCountry = codeCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    @Override
    public String toString() {
        return "Country{" +
                "codeCountry='" + codeCountry + '\'' +
                ", nameCountry='" + nameCountry + '\'' +
                '}';
    }
}
