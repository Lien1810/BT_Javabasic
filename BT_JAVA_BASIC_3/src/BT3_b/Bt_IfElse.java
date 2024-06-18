package BT3_b;

public class Bt_IfElse {
    static int number = 100;    //Tạo biến cố định number

    public static void thamSo(int n){ //Tạo hàm truyền tham số n
        if( n == number){       // Dùng câu lệnh If_Else để đặt điều kiện cho tham số n
            System.out.println("n bằng với number");
        }else if (n < number){
            System.out.println("n nhỏ hơn number");
        }else{
            System.out.println("n lớn hơn number");
        }
    }
    public static void main(String[] args) {
       thamSo(139); //Gọi lại hàm tại Main
       thamSo(90);
       thamSo(100);
    }
}
