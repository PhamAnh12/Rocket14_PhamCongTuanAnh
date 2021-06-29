package Exercise1Q2.backend;

import Exercise1Q2.entiy.TuyenSinh;

import java.util.Scanner;

public class Ex1Q2 {
    public  void  Menu(){
        TuyenSinh ts = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Mời lựa chọn:");
            System.out.println("1.Thêm mới thí sinh.");
            System.out.println("2.Hiện thị thông tin của thí sinh và khối thi của thí sinh.");
            System.out.println("3.Tìm kiếm theo số báo danh");
            System.out.println("4.Thoát khỏi chương trình.");
            int number = sc.nextInt();
            switch (number){
                case 1:
                    ts.addContestant();
                    break;
                case 2:
                    ts.showInfoContestant();
                    break;
                case 3:
                    ts.findByIdNum();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Bạn lựa chọn sai vui lòng lựa chọn lại");
                    Menu();
            }

        }
    }
}
