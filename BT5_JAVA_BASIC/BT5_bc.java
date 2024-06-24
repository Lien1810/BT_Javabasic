import java.util.ArrayList;

public class BT5_bc {
    // hàm con
    public static void addInfo(String maNV, String ten, String tuoi, String chucVu) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(maNV);
        arrayList.add(ten);
        arrayList.add(tuoi);
        arrayList.add(chucVu);
        System.out.println(arrayList);
    }

    // hàm chính
    public static void main(String[] args) {
        addInfo("NV001", "Lien Gabi","25","Tester");
    }
}
