package com.testingsystem2;

import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Exercise4 {
    //    Question 1:
//In ngẫu nhiên ra 1 số nguyên
    public  void Question1() {
        System.out.println(" Exercie4 Question1: ");
        Random random = new Random();
        int intramdom = random.nextInt();
        System.out.println("Số nguyên ngẫu nhiên:  " + intramdom);
    }

    //    Question 2:
//In ngẫu nhiên ra 1 số thực
    public  void Question2() {
        System.out.println(" Exercie4 Question2: ");

        Random random = new Random();
        float floatrandom = random.nextFloat();
        System.out.println("Số thực ngẫu nhiên:  " + floatrandom);
    }

    //Question 3:
//Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
    public  void Question3(String[] Arrname) {
        System.out.println(" Exercie4 Question3: ");
        Random random = new Random();
        int i = (int) (Math.random() * Arrname.length);
        System.out.println("Số tên  các bạn  ngẫu nhiên:  " + Arrname[i]);
    }

    //    Question 4:
//Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
    public  void Question4() {
        System.out.println(" Exercie4 Question4: ");
        Random random = new Random();
        int minDay = (int) LocalDate.of(1995, 07, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomdayin = LocalDate.ofEpochDay(randomDay);

        System.out.println(randomdayin);

    }

    //Question 5:
//Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
    public  void Question5() {
        System.out.println(" Exercie4 Question5: ");
        Random random = new Random();
        int now = (int) LocalDate.now().toEpochDay();
        long randomDay = now - random.nextInt(365);

        LocalDate randomDay1 = LocalDate.ofEpochDay(randomDay);

        System.out.println("Lấy ngẫu nhiên 1 ngày trong 1 năm trở  lại đây: "+randomDay1);

    }

    // Question 6:
//Lấy ngẫu nhiên 1 ngày trong quá khứ
    public  void Question6() {
        System.out.println(" Exercie4 Question6: ");
        Random random = new Random();
        int now = (int) LocalDate.now().toEpochDay();
        long randomDay =  random.nextInt(now);

        LocalDate randomDay1 = LocalDate.ofEpochDay(randomDay);

        System.out.println("Lấy  ngẫu nhiên 1 ngày trong quá khứ: " + randomDay1);

    }
//  Question 7:
//Lấy ngẫu nhiên 1 số có 3 chữ số
    public    void Question7(){
        System.out.println(" Exercie4 Question7: ");
        Random random1 = new Random();
        int Numderrandom = 1000 - random1.nextInt(900);
        System.out.println("Lấy ngẫu nhiên  1 số có 3 chữ số: "+Numderrandom);
    }
}
