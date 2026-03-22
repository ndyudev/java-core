package javacore.Interface;

public class MayTinhCasioFX500 implements MayTinhBoTuiInterface {
    @Override
    public double Cong(double a, double b) {
        return a + b;
    }

    @Override
    public double Nhan(double a, double b) {
        return a * b;
    }

    @Override
    public double Chia(double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println(e);
        }
        return a;
    }

    @Override
    public double Tru(double a, double b) {
        return a - b;
    }
}
