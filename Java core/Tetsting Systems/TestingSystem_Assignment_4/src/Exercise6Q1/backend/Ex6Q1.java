package Exercise6Q1.backend;

import Exercise6Q1.entity.VietnamesePhone;

import java.util.Scanner;

public class Ex6Q1 {


    public  void Menu(){
        VietnamesePhone vnPhone = new VietnamesePhone();
        Scanner sc = new Scanner(System.in);
        int number;
        while (true){
            System.out.println("Mời bạn chọn lựa chọn:");
            System.out.println("1. InsertContact.");
            System.out.println("2. RemoveContact.");
            System.out.println("3. UpdateContact.");
            System.out.println("4. SearchContact.");
            System.out.println("5. ShowContact.");
            System.out.println("6. Thoát khỏi chương.");
            number = sc.nextInt();
            switch (number){
                case 1:{
                    System.out.println("Nhập name:");
                    String name = sc.next();
                    System.out.println("Nhập tên Phone:");
                    String phone = sc.next();
                    vnPhone.insertContact(name,phone);
                    break;
                }
                case 2:{
                    System.out.println("Nhập name:");
                    String name = sc.next();
                    vnPhone.removeContact(name);
                    break;
                }
                case 3: {
                    System.out.println("Nhập name:");
                    String name = sc.next();
                    System.out.println("Nhập  new  Phone:");
                    String newphone = sc.next();
                    vnPhone.updateContact(name,newphone);
                    break;
                }
                case 4: {
                    System.out.println("Nhập name:");
                    String name = sc.next();
                    vnPhone.searchContact(name);
                    break;
                }
                case 5:{
                    vnPhone.showContact();
                    break;
                }
                case 6:
                    return;
                default:
                    System.out.println("Bạn nhập sai số vui lòng nhập lại.");
                    Menu();

            }
        }





    }
}
