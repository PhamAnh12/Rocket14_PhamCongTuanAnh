package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public  void  Question1(){
        System.out.println("Exercise1 Question1: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số lương 1 vào: ");
        float luong1 = sc.nextFloat();
        System.out.println("Nhập Số lương 2 vào: ");
        float luong2 = sc.nextFloat();
        sc.close();
        int luong1i = (int) luong1;
        int luong2i = (int) luong2;
        System.out.println("Lương 1:" + luong1i);
        System.out.println("Lương 2:" + luong2i);

    }
    public  void  Question2(){
        System.out.println("Exercise1 Question2: ");
        Random rd = new Random();
        int number = rd.nextInt(99999);
        int x = number;
        System.out.println("Số 5 chữ số sinh ngẫu nhiên:"  + number);
        String stx = String.valueOf(number);
        int count  = 0;
        while (x > 0){
            x= x/10;
            count++;
        }
        String st ="" ;
        for (int i= 0; i < 5 - count; i++){
                 st= st + "0";
        }
        System.out.println("Số 5 chữ số sinh ngẫu nhiên:"  + (st.concat(stx)));

    }
//    Question 3:
//Lấy 2 số cuối của số ở Question 2 và in ra.
//Gợi ý:
//Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//Cách 2: chia lấy dư số đó cho 100
    public  void Question3(){
//Cách 1:
        System.out.println("Exercise1 Question3: ");
        Random rd = new Random();
        int number = rd.nextInt(99999);
        int x = number%100;
        System.out.println("Số ngẫu nhiên là : " + number);
        System.out.println("Hai số cuối của số: " + x);
// Cách 2
        String stnumber = String.valueOf(number);
        System.out.println("Số ngẫu nhiên là : " + number);
        System.out.println("Hai số cuối của số: " + stnumber.substring(3));
    }
//    Question 4:
//Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
    public  double Question4(){
        System.out.println("Exercise1 Question3: ");
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        a = sc.nextInt();
        do {
            System.out.println("Nhập số thứ hai: ");
            b = sc.nextInt();
            if (b == 0) {
                System.out.println("Vui lòng nhập b khác 0 !");
            }
        } while (b == 0);

        return (double) a/b;
    }


}
