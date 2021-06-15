package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Exercise3 {
    public static void inradaynguyen(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
//    Hãy thiết kế giao diện console trong Java để thực hiện chương trình
//quay sổ xố.
//Kết quả đề bằng 2 số cuối của giải đặc biệt.
//Kết quả lô bằng 2 số cuối của tất cả các giải.
//Nếu trúng đề. tiền thắng = tiền cược*70 .
//Nếu trúng lô. tiền thắng = (tiền cược/23)*80*số lần giải về.
    public  void Question1(){
        System.out.println("Exercise3 Question1: ");
         Random rd = new Random();
        int [] gdacbiet = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gnhat = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gnhi1 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gnhi2 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gba1 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gba2 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gba3 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gba4 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gba5 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gba6 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gtu1 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gtu2 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gtu3 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gtu4 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gnam1 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gnam2 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gnam3 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gnam4 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gnam5 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gnam6 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gsau1 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gsau2 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gsau3 = {rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9),rd.nextInt(9)};
        int [] gbay1 = {rd.nextInt(9),rd.nextInt(9)};
        int [] gbay2 = {rd.nextInt(9),rd.nextInt(9)};
        int [] gbay3 = {rd.nextInt(9),rd.nextInt(9)};
        int [] gbay4 = {rd.nextInt(9),rd.nextInt(9)};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hai chữ số: ");
        int x = sc.nextInt();
        System.out.println("Nhập số  tiền cược đơn vị (nghìn): ");
        int tiencuoc = sc.nextInt();
        int tienthang = 0;
        int count = 0;
        int [] a = new int[2];
        a[1] = x%10;
        a[0] = (x-x%10)/10;
        int [] arr = new int[26];
//        các số trúng giải nhất
        arr[0] = gnhat[3]*10 + gnhat[4];
        //        các số trúng giải nhì
        arr[1] = gnhi1[3]*10 + gnhi1[4]; arr[2] =  gnhi2[3]*10 + gnhi2[4];
        //        các số trúng giải ba
        arr[3] = gba1[3]*10 + gba1[4]; arr[4] = gba2[3]*10 + gba2[4]; arr[5] = gba3[3]*10 + gba3[4];
        arr[6] = gba4[3]*10 + gba4[4];arr[7] = gba5[3]*10 + gba5[4]; arr[8] = gba6[3]*10 + gba6[4];
        //        các số trúng giải tư
        arr[9] = gtu1[3]*10 + gtu1[4];  arr[10] = gtu2[3]*10 + gtu2[4];  arr[11] = gtu3[3]*10 + gtu3[4];
        arr[12] = gtu4[3]*10 + gtu4[4];
        //        các số trúng giải năm
        arr[13] = gnam1[3]%10 + gnam1[4]; arr[14] = gnam2[3]%10 + gnam2[4];arr[15] = gnam3[3]%10 + gnam3[4];
        arr[16] = gnam4[3]%10 + gnam4[4];arr[17] = gnam5[3]%10 + gnam5[4];arr[18] = gnam6[3]%10 + gnam6[4];
        //        các số trúng giải sáu
        arr[19] = gsau1[3]%10 + gsau1[4];  arr[20] = gsau2[3]%10 + gsau2[4];arr[21] = gsau3[3]%10 + gsau3[4];
        //        các số trúng giải sáu
        arr[22] = gbay1[0]*10 + gbay1[1];arr[23] = gbay2[0]*10 + gbay2[1];arr[24] = gbay3[0]*10 + gbay3[1];
        arr[25] = gbay4[0]*10 + gbay4[1];
        System.out.println("Số trúng giải đặc biệt: ");
        inradaynguyen(gdacbiet);
        System.out.println();
        System.out.println("Hai số cuối trúng giải: ");
        for (int i = 0; i < 26; i++) {
            if(arr[i] >= 10 ) {
                System.out.print(arr[i] + " ");
            }
            else {
                System.out.print( "0" + arr[i] + " ");
            }
        }
        System.out.println();
// Trúng giải đặc biệt
        if(a[0] == gdacbiet[3] && a[1] == gdacbiet[4]){
            tienthang = tiencuoc*70;
            inradaynguyen(gdacbiet);
            System.out.println("Số tiền bạn nhận được là(nghìn): " + tienthang + " nghìn");
        }
        else {
            for (int i = 0; i < 26; i++) {
                if(x == arr[i]){
                    count++;
                }
            }

        }
        if(count > 0){
            tienthang = tiencuoc*80*count/23;
            System.out.println("Số tiền bạn nhận được là( nghìn): " + tienthang + " nghìn");
        }
        else  {
            System.out.println("Rất tiếc bạn không trúng giải");
        }
    }
}
