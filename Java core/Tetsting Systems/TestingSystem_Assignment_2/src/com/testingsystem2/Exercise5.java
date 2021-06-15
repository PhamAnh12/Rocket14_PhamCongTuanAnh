package com.testingsystem2;

import java.time.LocalDate;

import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    // Question 1:
    //Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
    public  void Question1() {
        System.out.println(" Exercie5 Question1: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập 3 số nguyên vào: ");
        System.out.println("Mời bạn nhập số thứ 1 vào: ");
        int a = sc.nextInt();
        System.out.println("Mời bạn nhập số thứ 2 vào: ");
        int b = sc.nextInt();
        System.out.println("Mời bạn nhập số thứ 3 vào: ");
        int c = sc.nextInt();
        System.out.println("Ba số bạn vừa nhập là: " + a + " " + b + " " + c);

    }

    //    Question 2:
//Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
    public  void Question2() {
        System.out.println(" Exercie5 Question2: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập 2 số thực vào: ");
        System.out.println("Mời bạn nhập số thực  thứ 1 vào: ");
        double a = sc.nextDouble();
        System.out.println("Mời bạn nhập số  thực thứ 2 vào: ");
        double b = sc.nextDouble();
        System.out.println("Ba số thực  bạn vừa nhập là: " + a + " " + b);

    }

    //    Question 3:
//Viết lệnh cho phép người dùng nhập họ và tên
    public  void Question3() {
        System.out.println(" Exercie5 Question3: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập Họ và Tên mình vào: ");
        String name = sc.nextLine();
        System.out.println("Họ và Tên bạn là: " + name);


    }

    //Question 4:
//Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
    public  void Question4() {
        System.out.println(" Exercie5 Question4: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập ngày sinh của mình: ");
        int day = sc.nextInt();
        System.out.println("Mời bạn nhập tháng sinh của mình: ");
        int month = sc.nextInt();
        System.out.println("Mời bạn nhập năm  sinh của mình: ");
        int year = sc.nextInt();
        LocalDate Birtday = LocalDate.of(year, month, day);
        System.out.println("Ngày sinh của bạn là: " + Birtday);

    }

    //    Question 5:
//Viết lệnh cho phép người dùng tạo account (viết thành method)
//Đối với property Position, Người dùng nhập vào 1 2 3 4 5 và vào
//chương trình sẽ chuyển thành Position.Dev, Position.Test,
//Position.ScrumMaster, Position.PM
    public  void Question5() {
        System.out.println(" Exercie5 Question5: ");
        Account acc = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Mời bạn nhập ID Account: ");
        acc.id = sc.nextInt();
        System.out.println("Mời bạn nhập Email Account: ");
        acc.email = sc.next();
        System.out.println("Mời bạn nhập User name Account: ");
        acc.username = sc.next();
        System.out.println("Mời bạn nhập Fullname Account: ");
        acc.fullname = sc.next();
        System.out.println("Mời bạn nhập DepartmentName Account: ");
        Department der1 = new Department();
        der1.name = sc.next();
        acc.department = der1;
        System.out.println("Nhập position (Nhập các số từ 1 đến 4 tương ứng với: 1.Dev, 2.Test, 3.Scrum_Master, 4.PM): ");
        int posNum = sc.nextInt();
        switch (posNum) {
            case 1:
                Position pos1 = new Position();
                pos1.name = Position.PositionName.Dev;
                acc.position = pos1;
                break;
            case 2:
                Position pos2 = new Position();
                pos2.name = Position.PositionName.Test;
                acc.position = pos2;
                break;
            case 3:
                Position pos3 = new Position();
                pos3.name = Position.PositionName.Scrum;
                acc.position = pos3;
                break;
            case 4:
                Position pos4 = new Position();
                pos4.name = Position.PositionName.PM;
                acc.position = pos4;
                break;

        }
        acc.createdate = LocalDate.now();
        System.out.println("ID: " + acc.id + "  Email: " + acc.email + " Username: " + acc.username + "\n");
        System.out.println("Full name: " + acc.fullname + " DepartmentName:" + acc.department.name + "  PostitionName: " + acc.position.name + "   Createdate: " + acc.createdate);


    }

    //    Question 6:
//Viết lệnh cho phép người dùng tạo department (viết thành method)
    public  void Question6() {
        System.out.println(" Exercie5 Question6: ");
        Scanner sc = new Scanner(System.in);
        Department der1 = new Department();
        System.out.println("Nhập DepartmentID Vào: ");
        der1.id = sc.nextInt();
        System.out.println("Nhập Department Name Vào: ");
        der1.name = sc.next();
        System.out.println("DepartmentID: " + der1.id + "  DepartmentName:  " + der1.name);
    }

    //   Question 7:
//Nhập số chẵn từ console
    public static void Question7() {
        System.out.println(" Exercie5 Question7: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số chẵn: ");
        int x = sc.nextInt();
        do {

            if (x % 2 != 0) {
                System.out.println("Vui lòng nhập lại: ");
                x = sc.nextInt();
            }


        } while (x % 2 != 0);
        System.out.println("Số chẵn bạn đã nhập là: " + x);

    }

    // Question 8:
//Viết chương trình thực hiện theo flow sau:
//Bước 1:
//Chương trình in ra text "mời bạn nhập vào chức năng muốn sử dụng"
//Bước 2:
//Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo department
//Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập lại" và quay trở lại bước 1
    public  void Question8() {
        System.out.println(" Exercie5 Question8: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mới bạn nhập vào chức năng muốn sử dụng:");
            System.out.println("1 Tạo Account: ");
            System.out.println("2 Tạo Department: ");
            int number = sc.nextInt();
            if (number == 1 || number == 2) {
                switch (number) {
                    case 1:
                        Question5();
                        break;
                    case 2:
                        Question6();
                        break;
                }
                return;
            } else {
                System.out.println("Vui lòng lựa chọn lại: ");
            }

        }
    }

    //    Question 9:
//Viết method cho phép người dùng thêm group vào account theo flow sau:
//Bước 1: In ra tên các usernames của user cho người dùng xem
//Bước 2: Yêu cầu người dùng nhập vào username của account
//Bước 3: In ra tên các group cho người dùng xem
//Bước 4: Yêu cầu người dùng nhập vào tên của group
//Bước 5: Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó .
    public  void Question9() {

        // Tạo Group

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        group1.createdate = LocalDate.of(2021, 05, 28);
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";

        group2.createdate = LocalDate.of(2021, 05, 15);
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createdate = LocalDate.of(2021, 04, 15);

// Tạo Account

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "nguyenvananh@gmail.com";
        acc1.username = "nguyenvananh";
        acc1.fullname = "Nguyen Van Anh";
        acc1.createdate = LocalDate.now();
        Group[] groupAcc1 = new Group[10];
        groupAcc1[1] = group1;
        groupAcc1[2] = group2;
        acc1.groups = groupAcc1;
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "phamvanbinh@gmail.com";
        acc2.username = "phamvanbinh123";
        acc2.fullname = "Pham Van Binh";
        acc2.createdate = LocalDate.of(2021, 04, 17);
        acc2.groups = new Group[]{group3, group2};
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "nguyencongchi@gmail.com";
        acc3.username = "nguyencongchi123";
        acc3.fullname = "Nguyen Cong Chi";

        acc3.createdate = LocalDate.now();

// add Group Account

        group1.accounts = new Account[]{acc1};
        group2.accounts = new Account[]{acc1, acc2};
        group3.accounts = new Account[]{acc2};
        Account[] accArr = {acc1, acc2, acc3};
        Group[] groupArr = {group1, group2, group3};
        System.out.println(" Exercie5 Question9: ");
        Scanner sc = new Scanner(System.in);
        //Bước 1: In ra tên các usernames của user cho người dùng xem
        System.out.println("Danh sách UserName của account: ");
        for (int i = 0; i < accArr.length; i++) {
            System.out.println("UserName Account" + (i + 1) + ": " + accArr[i].username);
        }
        //Bước 2: Yêu cầu người dùng nhập vào username của account
        System.out.println("Nhập UserName của account: ");
        String username = sc.next();
        //Bước 3: In ra tên các group cho người dùng xem
        System.out.println("Danh sách Group Name: ");
        for (int i = 0; i < groupArr.length; i++) {
            System.out.println("Group Name:" + (i + 1) + ": " + groupArr[i].name);
        }
        //Bước 4: Yêu cầu người dùng nhập vào tên của group
        System.out.println("Nhập Group Name : ");
        String groupname = sc.next();
        //Dựa vào username và tên của group người dùng vừa chọn, hãy thêm account vào group đó.
        int index_acc = -1;
        for (int i = 0; i < accArr.length; i++) {
            if (accArr[i].username.equals(username)) {
                index_acc = i;
            }
        }
        int index_group = -1;
        for (int i = 0; i < groupArr.length; i++) {
            if (groupArr[i].name.equals(groupname)) {
                index_group = i;
            }
        }
        if (index_acc < 0 || index_group < 0) {
            System.out.println("Vui kiểm tra lại tên username hoặc group name:");

        } else {
//            Thêm Grroup vào Account
            Group[] groadd = {groupArr[index_group]};
            accArr[index_acc].groups = groadd;
            System.out.println("Group bạn thêm vào là: " + accArr[index_acc].groups[0].name + " vào Account là: " + accArr[index_acc].username);

//            Thêm Account vào Group
            Account[] accadd = {accArr[index_acc]};
            groupArr[index_group].accounts = accadd;


        }

    }

    //Question 10: Tiếp tục Question 8 và Question 9
//Bổ sung thêm vào bước 2 của Question 8 như sau:
//Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào
//account
//Bổ sung thêm Bước 3 của Question 8 như sau:
//Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng
//text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác
//không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người
//dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để
//kết thúc chương trình)
    public void Question10() {
        System.out.println(" Exercie5 Question10: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mới bạn nhập vào chức năng muốn sử dụng:");
            System.out.println("1 Tạo Account: ");
            System.out.println("2 Tạo Department: ");
            System.out.println("3 Thêm Group vào Account: ");
            int number = sc.nextInt();
            if (number == 1 || number == 2 || number == 3) {
                switch (number) {
                    case 1:
                        this.Question5();
                        break;
                    case 2:
                        this.Question6();
                        break;
                    case 3:
                        this.Question9();
                }
                System.out.println("Bạn có muốn thực hiện chức năng khác không?");
                System.out.println("1.Có: ");
                System.out.println("2.Không: ");
                Scanner sc1 = new Scanner(System.in);
                int input = sc1.nextInt();
                if (input == 2) {
                    return;
                }
            } else {
                System.out.println("Vui lòng lựa chọn lại: ");
            }

        }
    }

    // Question 11: Tiếp tục Question 10
//Bổ sung thêm vào bước 2 của Question 8 như sau:
//Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account
//vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
//Bước 1:
//In ra tên các usernames của user cho người dùng xem
//Bước 2:
//Yêu cầu người dùng nhập vào username của account
//Bước 3:
//Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
//Bước 4:
//Thêm account vào group chương trình vừa chọn ngẫu
//nhiên
// THêm acccout ngau nhien vao group
    public static void AddAccinGroup() {

        // Tạo Group

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        group1.createdate = LocalDate.of(2021, 05, 28);
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";

        group2.createdate = LocalDate.of(2021, 05, 15);
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createdate = LocalDate.of(2021, 04, 15);

// Tạo Account

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "nguyenvananh@gmail.com";
        acc1.username = "nguyenvananh";
        acc1.fullname = "Nguyen Van Anh";
        acc1.createdate = LocalDate.now();
        Group[] groupAcc1 = new Group[10];
        groupAcc1[1] = group1;
        groupAcc1[2] = group2;
        acc1.groups = groupAcc1;
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "phamvanbinh@gmail.com";
        acc2.username = "phamvanbinh123";
        acc2.fullname = "Pham Van Binh";
        acc2.createdate = LocalDate.of(2021, 04, 17);
        acc2.groups = new Group[]{group3, group2};
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "nguyencongchi@gmail.com";
        acc3.username = "nguyencongchi123";
        acc3.fullname = "Nguyen Cong Chi";

        acc3.createdate = LocalDate.now();

// add Group Account

        group1.accounts = new Account[]{acc1};
        group2.accounts = new Account[]{acc1, acc2};
        group3.accounts = new Account[]{acc2};
        Account[] accArr = {acc1, acc2, acc3};
        Group[] groupArr = {group1, group2, group3};
        System.out.println(" Exercie5 Question9: ");
        Scanner sc = new Scanner(System.in);
        //Bước 1: In ra tên các usernames của user cho người dùng xem
        System.out.println("Danh sách UserName của account: ");
        for (int i = 0; i < accArr.length; i++) {
            System.out.println("UserName Account" + (i + 1) + ": " + accArr[i].username);
        }
        //Bước 2: Yêu cầu người dùng nhập vào username của account
        System.out.println("Nhập UserName của account: ");
        String username = sc.next();

        //Bước 3: Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
        Random rd = new Random();
        int ramdomgrr = rd.nextInt(groupArr.length - 1);
        //Dựa vào username thêm  của group group ngẫu nhiên , hãy thêm account vào group đó.
        int index_acc = -1;
        for (int i = 0; i < accArr.length; i++) {
            if (accArr[i].username.equals(username)) {
                index_acc = i;
            }
        }
        if (index_acc < 0 ) {
            System.out.println("Vui kiểm tra lại tên username hoặc group name:");

        } else {
//            Thêm Grroup vào Account
            Group[] groadd = {groupArr[ramdomgrr]};
            accArr[index_acc].groups = groadd;
            System.out.println("Account : " + accArr[index_acc].username  + "  thêm vào Group ngẫu nhiên  là: " + accArr[index_acc].groups[0].name);

//            Thêm Account vào Group
            Account[] accadd = {accArr[index_acc]};
            groupArr[ramdomgrr].accounts = accadd;


        }


    }

    public  void Question11() {
        System.out.println(" Exercie5 Question10: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mới bạn nhập vào chức năng muốn sử dụng:");
            System.out.println("1.Tạo Account: ");
            System.out.println("2.Tạo Department: ");
            System.out.println("3.Thêm Group vào Account: ");
            System.out.println("4.Thêm Account vào Group ngẫu nhiêu: ");
            int number = sc.nextInt();
            if (number == 1 || number == 2 || number == 3 || number == 4) {
                switch (number) {
                    case 1:
                        this.Question5();
                        break;
                    case 2:
                       this.Question6();
                        break;
                    case 3:
                        this.Question9();
                    case 4:
                        this.AddAccinGroup();
                }
                System.out.println("Bạn có muốn thực hiện chức năng khác không?");
                System.out.println("1.Có: ");
                System.out.println("2.Không: ");
                Scanner sc1 = new Scanner(System.in);
                int input = sc1.nextInt();
                if (input == 2) {
                    return;
                }
            } else {
                System.out.println("Vui lòng lựa chọn lại: ");
            }

        }
    }
}
