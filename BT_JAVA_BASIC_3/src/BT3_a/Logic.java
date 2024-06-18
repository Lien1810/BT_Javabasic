package BT3_a;

public class Logic {
    public static void main(String[] args) {
        String email1= "test@gmail.com";
        String passWord1 = "123456";
        String email2= "test@gmail.com";
        String passWord2 = "12345678";

        System.out.println((email1 == email2) && (passWord1 == passWord2));
        System.out.println((email1 == email2) || (passWord1 == passWord2));
    }
}
