package BT_JAVA_BASIC_2;

public class Calculator {
    public static int tong2SoNguyen(int x, int y){
        return x + y;
    }

    public static double tich2SoThuc(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(tong2SoNguyen(15,35));
        System.out.println(tich2SoThuc(2.0,3.5));
    }
}

