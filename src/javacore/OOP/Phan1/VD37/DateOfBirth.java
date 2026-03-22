package javacore.OOP.Phan1.VD37;

import java.util.Objects;

public class DateOfBirth {
    private String day;
    private String month;
    private String year;

    public DateOfBirth() {}

    public DateOfBirth(String day, String year, String month) {
        this.day = day;
        this.year = year;
        this.month = month;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "DateOfBirth{" +
                "day='" + day + '\'' +
                ", month='" + month + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DateOfBirth that = (DateOfBirth) o;
        return Objects.equals(day, that.day) && Objects.equals(month, that.month) && Objects.equals(year, that.year);
    }
}
