package com.testingsystem2;

public class Exercise1 {
    // Question 1
    public  void Question1(Account acc2) {
        // Question 1
        if (acc2.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");

        } else {
            System.out.println("Phòng ban của nhân viên này là: " + acc2.department.name);
        }
    }

    // Question 2
    public  void Question2(Account acc2) {

        int countgroup = acc2.groups.length;
        if (countgroup == 0) {
            System.out.println("Nhân viên này chưa có group");
        }
        if (countgroup == 1 || countgroup == 2) {
            System.out.println("Group của nhân viênnày là Java Fresher, C# Fresher");
        }
        if (countgroup == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        }
        if (countgroup >= 4) {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

    }

    // Question 3
    public  void Question3(Account acc2) {
        System.out.println(acc2.department == null ? "Nhân viên này chưa  có phòng ban." : "Phòng của nhân viên này là: " + acc2.department.name);
    }

    // Question4
    public  void Question4(Account acc1) {
        System.out.println(acc1.position.name.toString() == "Dev" ? "Đây là Developer" : "Người này không phải là Developer");
    }

    // Question 5
    public  void Question5(Group group1) {
        int countaccount1 = group1.accounts.length;
        switch (countaccount1) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều  thành viên");
                break;
        }
    }

    // Question 6   Sử dụng switch case để làm lại Question 2
    public  void Question6(Account acc2) {

        int countgroup2 = acc2.groups.length;
        switch (countgroup2) {
            case 0:
                System.out.println("Nhân viên này chưa có Group");
                break;
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
    }

    //Question 7  Sử dụng switch case để làm lại Question 4
    public  void Question7(Account acc1) {

        switch (acc1.position.name) {
            case Dev:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải Developer");
                break;
        }

    }

    // ForEach
    //    Question 8 In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
    //họ
    public  void Question8(Account[] accArr) {
        for (Account acc : accArr) {
            System.out.println("Email: " + acc.email + "\nFull Name: " + acc.fullname + "\nDepartment Name:" + acc.department.name + "\n");
        }
    }

    //    Quetion 9 In ra thông tin các phòng ban bao gồm: id và name
    public  void Question9(Department[] DerArr) {
        for (Department deparr : DerArr) {
            System.out.println("DepartmentID: " + deparr.id + "\nDepartment Name: " + deparr.name + "\n");
        }

    }

    //FOR
    //    Question 10  In ra thông tin các account bao gồm: Email, FullName và tên phòng ban
    public  void Question10(Account[] AccArr) {
        for (int i = 0; i < AccArr.length; i++) {
            System.out.println("Thông tin Account thứ " + (i + 1) + ": ");
            System.out.println("Email: " + AccArr[i].email + "\nFull Name: " + AccArr[i].fullname + "\nDepartment Name:" + AccArr[i].department.name + "\n");

        }
    }

    //    Question 11 In ra thông tin các phòng ban bao gồm: id và name
    public  void Question11(Department[] DepArr) {
        for (int i = 0; i < DepArr.length; i++) {
            System.out.println("Thông tin department " + (i + 1) + " : ");
            System.out.println("DepartmentID: " + DepArr[i].id + "\nDepartment Name: " + DepArr[i].name + "\n");

        }
    }

    //Question 12 Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
    public static void Qustion12(Department[] DepArr) {
        for (int i = 0; i < 2; i++) {

            System.out.println("Thông tin department " + (i + 1) + " : ");
            System.out.println("DepartmentID: " + DepArr[i].id + "\nDepartment Name: " + DepArr[i].name + "\n");

        }
    }

    // Question 13 In ra thông tin tất cả các account ngoại trừ account thứ 2
    public  void Question13(Account[] AccArr) {
        for (int i = 0; i < AccArr.length; i++) {
            if (i !=1) {
                System.out.println("Thông tin Account thứ " + (i + 1) + ": ");
                System.out.println("Email: " + AccArr[i].email + "\nFull Name: " + AccArr[i].fullname + "\nDepartment Name:" + AccArr[i].department.name + "\n");
            }
        }
    }

    //    Question 14 In ra thông tin tất cả các account có id < 4
    public void Question14(Account[] AccArr) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thông tin Account thứ " + (i + 1) + ": ");
            System.out.println("Email: " + AccArr[i].email + "\nFull Name: " + AccArr[i].fullname + "\nDepartment Name:" + AccArr[i].department.name + "\n");

        }
    }

    // Question 15 In ra các số chẵn nhỏ hơn hoặc bằng 20
    public  void Question15() {
        System.out.println("Các số chẵn từ 1 đến 20: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

    }
    // WHILE
    // Question 16 Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break, continue
    public   void  Question16(Account [] AccArr, Department [] DepArr){
        // Question 10
        System.out.println("Question 10: ");
        int a = 0;
        while (a < AccArr.length){
            System.out.println("Thông tin Account thứ " + (a + 1) + ": ");
            System.out.println("Email: " + AccArr[a].email + "\nFull Name: " + AccArr[a].fullname + "\nDepartment Name:" + AccArr[a].department.name + "\n");
            a++;
        }
        // Question 11
        System.out.println("Question 11: ");
        int b = 0;
        while (b < DepArr.length){
            System.out.println("Thông tin department " + (b + 1) + " : ");
            System.out.println("DepartmentID: " + DepArr[b].id + "\nDepartment Name: " + DepArr[b].name + "\n");
            b++;
        }
        //Question 12
        System.out.println("Question 12: ");
        int c = 0;
        while (c < 2){
            System.out.println("Thông tin department " + (c + 1) + " : ");
            System.out.println("DepartmentID: " + DepArr[c].id + "\nDepartment Name: " + DepArr[c].name + "\n");
            c++;
        }
        // Question 13
        System.out.println("Question 13: ");
        int d = 0;
        while (d < AccArr.length){
            if (d != 1) {
                System.out.println("Thông tin Account thứ " + (d + 1) + ": ");
                System.out.println("Email: " + AccArr[d].email + "\nFull Name: " + AccArr[d].fullname + "\nDepartment Name:" + AccArr[d].department.name + "\n");
            }
             d++;

        }
        // Question 14
        System.out.println("Question 14: ");
        int e = 0;
        while (e < 3){
            System.out.println("Thông tin Account thứ " + (e + 1) + ": ");
            System.out.println("Email: " + AccArr[e].email + "\nFull Name: " + AccArr[e].fullname + "\nDepartment Name:" + AccArr[e].department.name + "\n");
            e++;
        }
        // Question 15
        System.out.println("Question 15: ");
        int f = 1;
        System.out.println("Các số chẵn từ 1 đến 20 là:");
        while (f <= 20){
            if (f % 2 == 0){
                System.out.print(f + " ");
            }
            f++;
        }

    }
    public   void  Question17(Account [] AccArr, Department [] DepArr){
        // Question 10
        System.out.println("Question 10: ");
        int a = 0;
        do {
            System.out.println("Thông tin Account thứ " + (a + 1) + ": ");
            System.out.println("Email: " + AccArr[a].email + "\nFull Name: " + AccArr[a].fullname + "\nDepartment Name:" + AccArr[a].department.name + "\n");
            a++;
        }
        while (a < AccArr.length);
        // Question 11
        System.out.println("Question 11: ");
        int b = 0;
        do {
            System.out.println("Thông tin department " + (b + 1) + " : ");
            System.out.println("DepartmentID: " + DepArr[b].id + "\nDepartment Name: " + DepArr[b].name + "\n");
            b++;
        }
        while (b < DepArr.length);
        //Question 12
        System.out.println("Question 12: ");
        int c = 0;
        do {
            System.out.println("Thông tin department " + (c + 1) + " : ");
            System.out.println("DepartmentID: " + DepArr[c].id + "\nDepartment Name: " + DepArr[c].name + "\n");
            c++;
        }
        while (c < 2);
        // Question 13
        System.out.println("Question 13: ");
        int d = 0;
        do {
            if (d != 1) {
                System.out.println("Thông tin Account thứ " + (d + 1) + ": ");
                System.out.println("Email: " + AccArr[d].email + "\nFull Name: " + AccArr[d].fullname + "\nDepartment Name:" + AccArr[d].department.name + "\n");
            }
            d++;

        }
        while (d < AccArr.length);
        // Question 14
        System.out.println("Question 14: ");
        int e = 0;
        do {
            System.out.println("Thông tin Account thứ " + (e + 1) + ": ");
            System.out.println("Email: " + AccArr[e].email + "\nFull Name: " + AccArr[e].fullname + "\nDepartment Name:" + AccArr[e].department.name + "\n");
            e++;
        }
        while (e < 3);
        // Question 15
        System.out.println("Question 15: ");
        int f = 1;
        System.out.println("Các số chẵn từ 1 đến 20 là:");
        do {
            if (f % 2 == 0){
                System.out.print(f + " ");
            }
            f++;
        }
        while (f <= 20);

    }

}
