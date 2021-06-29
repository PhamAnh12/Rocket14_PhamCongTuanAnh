package Exercise2Q3.backend;

import Exercise2Q3.entity.Rectange;
import Exercise2Q3.entity.Square;

import java.util.Scanner;

public class Ex2Q3 {
    public void showSCVHCN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài:");
        float a = sc.nextFloat();
        System.out.println("Nhập chiều rộng:");
        float b = sc.nextFloat();
        Rectange rectange = new Rectange(a, b);
        System.out.println("Chu vi hình chữ nhật là: " +   rectange.tinhChuvi());

        System.out.println("Diện tích hình chữ nhật là: " + rectange.dienTich());


    }

    public void showVuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài:");
        float a = sc.nextFloat();
        Square square = new Square(a);
        System.out.println("Chu vi hình vuông là: " +  square.tinhChuvi());

        System.out.println("Diện tích hình vuông là: " +  square.dienTich());

    }

    public void Menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời lựa chọn:");
            System.out.println("1.Tính chu vi diện tích hình chữ nhật.");
            System.out.println("2.Tính chu vi diện tích hình vuông.");
            System.out.println("3.THoát khỏi chương trình.");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    showSCVHCN();
                    break;
                case 2:
                    showVuong();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Bạn chọn số vui lòng chọn lại");
                    Menu();


            }
        }
    }
}
