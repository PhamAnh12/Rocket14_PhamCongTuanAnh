package Exercise1Q2.entiy;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh  implements  ITuyenSinh{
    private ArrayList<Contestant> listContestant;

    public TuyenSinh() {
        listContestant = new ArrayList<Contestant>();
    }
    @Override
    public void addContestant() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhập vào tên thí sinh:");
        String name = sc1.nextLine();
        System.out.println("Nhập vào địa chỉ thí sinh:");
        String address = sc1.nextLine();
        System.out.println("Nhập vào mức ưu tiên thí sinh:");
        int priority = sc1.nextInt();
        System.out.println("Nhập vào khối thí sinh.Nhập một trong các chữ sau: A, B, C. ");
        String block = sc1.next();
        listContestant.add(new Contestant(name,address,priority, new Block(block)));

    }

    @Override
    public void showInfoContestant() {
        for (Contestant contestant : listContestant){
            System.out.println(contestant);
        }

    }

    @Override
    public void findByIdNum() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhập id muốn tìm vào");
        int id = sc2.nextInt();
        for (Contestant contestant : listContestant){
            if (contestant.getIdNum() == id) {
                System.out.println(contestant);
            }
        }
    }
}
