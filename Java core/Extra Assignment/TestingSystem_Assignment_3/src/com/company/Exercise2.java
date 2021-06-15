package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise2 {

    public   static String nhapchuoi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập sâu vào: ");
        String st = sc.nextLine();
        return st;
    }
    //    Question 1:
//Nhập xâu họ tên, in ra họ, tên dưới dạng viết hoa
    public  void  Question1(){
        System.out.println("Exercise2 Question1: ");
        System.out.println("Nhập họ tên vào: ");
        String st = nhapchuoi();
        System.out.println("Họ tên viết hoa: " + st.toUpperCase());
    }
//    Question2
//    Nhập xâu. In ra tất các các vị trí của chữ ‘a’ trong xâu và tổng số lần
//xuất hiện của nó.
    public  void  Question2(){
        String st = nhapchuoi();

    }
}
