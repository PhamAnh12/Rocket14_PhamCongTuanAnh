package com.testingsystem2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise2 {
    //Question 1 Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số nguyên đó
    public  void Question1(int a) {
        System.out.println("Số nguyên: " + a);
    }

    //Question 2:
    //Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
    //ra số nguyên đó thành định dạng như sau: 100,000,000
    public  void Question2(int b) {
        System.out.println(System.out.printf(Locale.US, "%,d%n", b));
    }

    //Question 3: Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số thực đó chỉ bao gồm 4 số đằng sau
    public  void Question3(float c) {
        System.out.printf("%5.4f%n", c);
    }
    //  uestion 4:
    //Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
    //dạng như sau:
    //Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
    //Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.
    public   void  Question4(String s){
        System.out.printf("Tên tôi là \"" + s + "\" và tôi đang độc thân\n");
    }
    //Question 5:
    //Lấy thời gian bây giờ và in ra theo định dạng sau:
    //24/04/2020 11h:16p:20s
    public   void  Question5(Date datenow){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dateString  = df.format(datenow);
        System.out.println("Ngày giờ được định dạnh: " + dateString);
    }
    //Question 6: In ra thông tin account (như Question 8 phần FOREACH) theo định dạng table (giống trong Database)
    public    void Question6(Account [] accArr ){
        System.out.print("Email                          "  +"Full Name             "  + "Department Name " +  "\n");
        for (Account acc : accArr) {
            System.out.println( acc.email + "       " +   acc.fullname + "     " +acc.department.name   );
        }
    }
}
