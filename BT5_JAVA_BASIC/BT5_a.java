import java.util.ArrayList;

public class BT5_a {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); //kb 1 mang trong

        for (int i = 0; i <= 50; i++) {
            //dieu kien phat hien 1 so chan
            if (i % 2 == 0) {
                arrayList.add(i); //them phan tu do vao mang tren
            }
        }
        //duyet vong lap voi cai mang tren
        for (int i =0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList); //Hien thi lai cac phan tu
    }
}
