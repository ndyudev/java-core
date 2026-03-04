package JavaCore.Overloading;
/*
Overloading (Nạp chồng phương thức) nghĩa là trong cùng một class
bạn có nhiều phương thức cùng tên nhưng khác nhau về số lượng tham số
hoặc kiểu dữ liệu của tham số.
 */
public class MathOverloading {
    public static void main(String[] args) {
        MyMath mymath = new MyMath();
        System.out.println(mymath.timMin(5, 6));
        System.out.println(mymath.timMin(5.5, 6.5));
        System.out.println(mymath.tinhTong(5,6));
        double arr[] = new double[] {1,2,3,4,5};
        System.out.println(mymath.tinhTong(arr, 0));
    }
}
