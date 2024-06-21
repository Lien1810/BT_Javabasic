public class BaiTap4 {
    public static void main(String[] args) {
        //In ra cac so chan
        for(int i=0; i<=50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
         //Tao mang chua cac so chan va duyet cac phan tu trong mang
            int count = 0;
            for(int i = 0;i <= 50; i++) {
                if (i % 2 == 0) {
                    count++;   //Đếm xem KQ trả về trên có bn phần tử đáp ứng yêu cầu là số chẵn để khai báo đúng kích thước
                }
            }
            int[] a = new int[count];
            int index = 0;      //Tạo biến index để thiết lập vị trí cho từng phần tử trong mảng lấy từ trên
            for(int i = 0; i <= 50; i++) {
                if (i % 2 == 0) {
                    a[index] = i;
                    index++;
                }
            }
            for(int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" "); //Duyệt và Hiển thị ra mảng có các phần tu
            }
    }
}
