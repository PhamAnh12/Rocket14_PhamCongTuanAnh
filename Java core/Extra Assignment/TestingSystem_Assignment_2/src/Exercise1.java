import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercise1 {
    //     Question 1:
//Viết chương trình nhập vào một số thực. Đơn vị tính cho số này là centimet(cm).
//Hãy in ra số tương đương tính bằng foot (số thực, có 2 số lẻ thập phân) và inch (số thực, có 2 số lẻ thập phân).
//Với 1 inch = 2.54 cm và 1 foot = 12 inches.
    public  void Question1() {
        System.out.println("Exercise1 Question1: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số thực vào (cm): ");
        double x = sc.nextDouble();
        double inch = x / 2.54;
        double foot = inch / 12;
        System.out.println("Đổi ra foot: ");
        System.out.printf("%.2f", foot);
        System.out.println();
        System.out.println("Đổi ra inch: ");
        System.out.printf("%.2f", inch);

    }

    //    Question 2:
//Viết chương trình nhập vào số giây từ 0 tới 68399, đổi số giây này thành dạng
//[giờ:phút:giây], mỗi thành phần là một số nguyên có 2 chữ số.
//Ví dụ: 02:11:05
    public  void Question2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise1 Question2: ");
        System.out.println("Nhập số trong khoảng từ 0 đến 68399: ");
        int x = sc.nextInt();
        int h = (int) x / 3600;
        int m = (int) (x - h * 3600) / 60;
        int s = (int) x - h * 3600 - m * 60;
        System.out.println(h + ":" + m + ":" + s);

    }

    //    Question 3:
//Viết chương trình nhập vào 4 số nguyên.
//Hiển thị ra số lớn nhất và nhỏ nhất
//Ví dụ:
//nhập vào 4 số 1,2,3,4 thì kết quả là:
//Số lớn nhất là: 4
//Số nhỏ nhất là: 1
    public  void Question3() {
        int[] Arrint = new int[4];
        int min, max, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise1 Question3: ");
        System.out.println("Nhập bốn số nguyên vào:  ");
        for (int i = 0; i < 4; i++) {
            System.out.println("Nhập số thứ " + (i + 1) + ":");
            Arrint[i] = sc.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (Arrint[i] > Arrint[j]) {
                    temp = Arrint[j];
                    Arrint[j] = Arrint[i];
                    Arrint[i] = temp;
                }
            }
        }
        min = Arrint[0];
        max = Arrint[3];
        System.out.println("số nhỏ nhất là:   " + min);
        System.out.println("số lớn  nhất là:   " + max);

    }

    //    Question 4:
//Nhập vào hai số tự nhiên a và b. Tính hiệu của hai số đó.
//Nếu hiệu số lớn hơn 0 thì in ra dòng chữ [Số thứ nhất lớn hơn số thứ hai].
//Nếu hiệu số nhỏ hơn 0 thì in ra dòng chữ [Số thứ nhất nhỏ hơn số thứ hai].
    public  void Question4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise1 Question4: ");

        System.out.println("Nhập hai số nguyên vào:  ");
        System.out.println("Nhập  số nguyên  thứ 1 vào:  ");
        int a = sc.nextInt();
        System.out.println("Nhập  số nguyên  thứ 2 vào:  ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("Số thứ nhất hơn số thứ hai  ");
        } else {
            System.out.println("Số thứ hai lớn hơn số thứ nhất");
        }
//      Question 5:
//Nhập vào 2 số tự nhiên a và b. Kiểm tra xem a có chia hết cho b không


    }

    public void Question5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise1 Question5: ");

        System.out.println("Nhập hai số nguyên vào:  ");
        System.out.println("Nhập  số nguyên  thứ 1 vào:  ");
        int a = sc.nextInt();
        System.out.println("Nhập  số nguyên  thứ 2 vào:  ");
        int b = sc.nextInt();
        if (a % b == 0) {
            System.out.println("Số thứ nhất chia hết cho  số thứ hai  ");
        } else {
            System.out.println("Số thứ hai không chia hết cho số thứ nhất");
        }

    }

    //    Question 6:
//Xếp loại sinh viên theo các qui luật dưới đây:
//Nếu điểm >= 9.0 - Loại xuất sắc
//Nếu 8.0<= điểm < 9.0 - Loại giỏi
//Nếu 7.0<= điểm < 8.0 - Loại khá2
//Nếu 6.0 <= điểm < 7.0 - Loại trung bình khá
//Nếu 5.0 <= điểm < 6.0 - Loại trung bình
//Nếu điểm < 5.0 - Loại kém
//Với điểm = ( (điểm toán)*2 + điểm lý + điểm hóa )/4
//Viết Chương trình:
//a. Nhập vào điểm 3 môn học
//b. Tính điểm trung bình
//c. Xác định học lực của học sinh dựa trên điểm trung bình
//d. Hiển thị học lực của học sinh
    public  void Question6() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exercise1 Question6: ");

        System.out.println("Nhập điểm 3 môn học vào  vào:  ");
        System.out.println("Nhập điểm môn  Toán  vào:  ");
        double toan = sc.nextDouble();
        System.out.println("Nhập  điểm môn Lý  vào:  ");
        double ly = sc.nextDouble();
        System.out.println("Nhập  điểm môn Hoá vào:  ");
        double hoa = sc.nextDouble();
        double diemTB = (toan*2 + ly + hoa)/4;
        System.out.println("Điểm TB: " + diemTB);
        if (diemTB < 5.0) {
            System.out.println("Xếp loại Kém");
        }
        if (5.0 <= diemTB  && diemTB < 6.0) {
            System.out.println("Xếp loại Trung Bình");
        }
        if (6.0 <= diemTB  && diemTB < 7.0) {
            System.out.println("Xếp loại Trung Bình Khá");
        }
        if (7.0 <= diemTB  && diemTB < 8.0) {
            System.out.println("Xếp loại Khá");
        }
        if (8.0 <= diemTB  && diemTB < 9.0) {
            System.out.println("Xếp loại  Giỏi");
        }
        else {
            System.out.println("Xếp loại  Xuất Sắc");
        }


    }
}
