package JavaCore.Overloading;

public class MyMath {

    public int timMin(int a, int b) {
        if( a > b ) {
            return a;
        } else {
            return b;
        }
    }

    public double timMin( double a, double b ) {
        if( a > b ) {
            return a;
        } else {
            return b;
        }
    }

    public int tinhTong(int a, int b ) {
        return a + b;
    }

    public double tinhTong(double[] arr, double a) {
        double tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i];
        }
        return tong;
    }
}
