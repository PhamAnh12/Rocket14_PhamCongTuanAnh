package Exercise5Q4.backend;

import Exercise5Q4.entity.Bao;
import Exercise5Q4.entity.Sach;
import Exercise5Q4.entity.Tailieu;
import Exercise5Q4.entity.Tapchi;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Ex5Q4 {
    public static int ID = 0;
    private ArrayList<Tailieu> tlList = new ArrayList<Tailieu>();

    public Ex5Q4() {
        getTlList();

    }

    public ArrayList<Tailieu> getTlList() {
        return tlList;
    }

    public void Menu() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Mời lựa chọn các chức năng sau:");
            System.out.println("1.Thêm mới tài liêu: Sách, tạp chí, báo.");
            System.out.println("2.Xoá tài liệu theo mã tài liệu.");
            System.out.println("3.Hiện thị thông tin về tài liệu.");
            System.out.println("4.Tìm kiếm tài liệu theo loại: Sách, tạp chí, báo...");
            System.out.println("5.Thoát khỏi chương trình.");
            int numder = sc.nextInt();
            switch (numder) {
                case 1:
                    System.out.println("Bạn chọn thêm mới tài liêu: Sách, tạp chí, báo.");
                    addTailieu();
                    break;
                case 2:
                    System.out.println("Bạn chọn Xoá tài liệu theo mã tài liệu.");
                    deleteTailieu();
                    break;
                case 3:
                    System.out.println("Bạn chọn hiện thị thông tin về tài liệu.");
                    showTailieu();
                    break;
                case 4:
                    System.out.println("Bạn  chọn tìm kiếm tài liệu theo loại: Sách, tạp chí, báo..");
                    findTailieu();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Bạn chọn  sai số vui lòng chọn lại.");
                    Menu();
            }
        }
    }

    public void addTailieu() {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 =  new Scanner(System.in);
        System.out.println("Bạn lựa chọn thêm: ");
        System.out.println("1.Thêm Sách");
        System.out.println("2.Thêm Tạp chí");
        System.out.println("3.Thêm Báo");
        int number = sc1.nextInt();
        Tailieu tl = inputTailieu();
        switch (number) {
            case 1: {
                System.out.println("Nhập tên tác giả");
                String nameTG = sc2.nextLine();
                System.out.println("Nhập số trang");
                int soTrang = sc1.nextInt();
                Sach sach = new Sach(tl.getIdTL(), tl.getNameNXB(), tl.getSoBPH(), nameTG, soTrang);
                tlList.add(sach);
                break;
            }
            case 2: {
                System.out.println("Nhập phát hành");
                int soPH = sc1.nextInt();
                System.out.println("Nhập tháng phát hành");
                int thangPH = sc1.nextInt();
                Tapchi tapchi = new Tapchi(tl.getIdTL(), tl.getNameNXB(), tl.getSoBPH(), soPH, thangPH);
                tlList.add(tapchi);
                break;
            }
            case 3: {
                System.out.println("Nhập ngày phát hành");
                int date = sc1.nextInt();
                System.out.println("Nhập tháng phát hành");
                int month = sc1.nextInt();
                System.out.println("Nhập năm  phát hành");
                int year = sc1.nextInt();
                Date date1 = new Date(year, month, date);
                Bao bao = new Bao(tl.getIdTL(), tl.getNameNXB(), tl.getSoBPH(), date1);
                tlList.add(bao);
                break;


            }


        }
    }

    public Tailieu inputTailieu() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhập tên nhà xuất bản");
        String nameNXB = sc2.nextLine();
        System.out.println("Nhập số bản phát hành");
        int soBPH = sc2.nextInt();
        ID++;
        Tailieu tl = new Tailieu(ID, nameNXB, soBPH);
        return tl;
    }

    public void showTailieu() {
        for (Tailieu tailieu : tlList) {
            System.out.println(tailieu);
        }
    }

    public void deleteTailieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu cần xoá:");
        int id = sc.nextInt();
        int count = 0;
        for (Tailieu tailieu : tlList) {
            if (tailieu.getIdTL() == id) {
                tlList.remove(tailieu);
                count++;
            }

        }
        if (count > 0) {
            System.out.println("Tài liệu xoá tành công.");
            showTailieu();
        } else {
            System.out.println("Không tài thấy id cần xoá.");
            System.out.println("Vui lòng nhập lại ID cần xoá");
            deleteTailieu();
        }
    }

    public void findTailieu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn loại tài càn tìm.");
        System.out.println("1.Sách");
        System.out.println("2.Tạp chí");
        System.out.println("3.Báo");
        int number = sc.nextInt();
        switch (number) {
            case 1: {
                for (Tailieu tailieu : tlList) {
                    if (tailieu instanceof Sach) {
                        System.out.println(tailieu);
                    }
                }
                break;
            }
            case 2: {
                for (Tailieu tailieu : tlList) {
                    if (tailieu instanceof Tapchi) {
                        System.out.println(tailieu);
                    }
                }
                break;
            }
            case 3: {
                for (Tailieu tailieu : tlList) {
                    if (tailieu instanceof Bao) {
                        System.out.println(tailieu);
                    }
                }
                break;
            }


        }

    }

}
