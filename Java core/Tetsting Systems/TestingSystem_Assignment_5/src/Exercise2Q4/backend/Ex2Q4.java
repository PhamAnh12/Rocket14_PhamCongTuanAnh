package Exercise2Q4.backend;

import Exercise2Q4.entity.MyMath;

import java.util.Scanner;

public class Ex2Q4 {
    private MyMath myMath;
    public  Ex2Q4(){
        myMath = new MyMath();
    }
    public  void showsumint(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên a : ");
        int a = sc.nextInt();
        System.out.println("Nhập số nguyên b : ");
        int b = sc.nextInt();
        System.out.println("Tổng 2 số nguyên a và b : " + myMath.Sum(a,b) );
    } public  void showsumfloat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thực a : ");
        float a = sc.nextFloat();
        System.out.println("Nhập số thực b : ");
        float b = sc.nextFloat();
        System.out.println("Tổng 2 số thực a và b : " + myMath.Sum(a,b) );
    }
    public  void  Menu(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1.Tính tổng 2 số nguyên. ");
            System.out.println("2.Ting tổng 2 số thực. ");
            System.out.println("3.Thoát khỏi chương trình. ");
            int number = sc.nextInt();
            switch (number){
                case 1:
                    showsumint();
                    break;
                case 2:
                    showsumfloat();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Bạn nhập sai số vui lòng nhập lại: ");
                    Menu();

            }
        }
    }

}
