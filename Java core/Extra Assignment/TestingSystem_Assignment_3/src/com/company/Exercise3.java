package com.company;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class Exercise3 {
    public int[] taogiai() {
        Random rd = new Random();
        int[] taogiai = {rd.nextInt(9), rd.nextInt(9), rd.nextInt(9), rd.nextInt(9), rd.nextInt(9)};

        return taogiai;
    }

    public int[] taogiaibay() {
        Random rd = new Random();
        int[] taogiaibay = {rd.nextInt(9), rd.nextInt(9)};
        return taogiaibay;
    }

    public int[][] sinhracacgiai() {
        int[] gdacbiet = taogiai();
        int[] gnhat = taogiai();
        int[] gnhi1 = taogiai();
        int[] gnhi2 = taogiai();
        int[] gba1 = taogiai();
        int[] gba2 = taogiai();
        int[] gba3 = taogiai();
        int[] gba4 = taogiai();
        int[] gba5 = taogiai();
        int[] gba6 = taogiai();
        int[] gtu1 = taogiai();
        int[] gtu2 = taogiai();
        int[] gtu3 = taogiai();
        int[] gtu4 = taogiai();
        int[] gnam1 = taogiai();
        int[] gnam2 = taogiai();
        int[] gnam3 = taogiai();
        int[] gnam4 = taogiai();
        int[] gnam5 = taogiai();
        int[] gnam6 = taogiai();
        int[] gsau1 = taogiai();
        int[] gsau2 = taogiai();
        int[] gsau3 = taogiai();
        int[] gbay1 = taogiaibay();
        int[] gbay2 = taogiaibay();
        int[] gbay3 = taogiaibay();
        int[] gbay4 = taogiaibay();
        int[][] arrg = {gdacbiet, gnhat, gnhi1, gnhi2, gba1, gba2, gba3, gba4, gba5, gba6, gtu1, gtu2, gtu3, gtu4, gnam1, gnam2, gnam3, gnam4, gnam5, gnam6, gsau1, gsau2, gsau3, gbay1, gbay2, gbay3, gbay4};
        return arrg;
    }

    public void inracacgiai(int[][] arr) {
        System.out.println("Số trúng giải đặc biệt: ");
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
        System.out.println("Số trúng giải nhất: ");
        for (int i = 1; i <= 1; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
        }
        System.out.println();
        System.out.println("Các số trúng giải nhì: ");
        for (int i = 2; i <= 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("  ");
        }
        System.out.println();
        System.out.println("Các số trúng giải ba: ");
        for (int i = 4; i <= 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("  ");
        }
        System.out.println();
        System.out.println("Các số trúng giải tư: ");
        for (int i = 9; i <= 12; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("  ");

        }
        System.out.println();
        System.out.println("Các số trúng giải năm: ");
        for (int i = 13; i <= 18; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("  ");

        }
        System.out.println();
        System.out.println("Các số trúng giải sáu: ");
        for (int i = 19; i <= 21; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("  ");

        }
        System.out.println();
        System.out.println("Các số trúng giải bảy: ");
        for (int i = 22; i <= 25; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("  ");

        }
        System.out.println();

    }

    public void inra2socuoigiai(int[][] arr) {
        System.out.println("Hai số cuối  của  giải đặc biệt: ");
        if ((arr[0][3] * 10 + arr[0][4]) < 10) {
            System.out.print("0" + (arr[0][3] * 10 + arr[0][4]));
        } else {
            System.out.print((arr[0][3] * 10 + arr[0][4]));
        }
        System.out.println();
        System.out.println("Hai số cuối  của các giải khác: ");
        for (int i = 1; i < 22; i++) {
            if ((arr[i][3] * 10 + arr[i][4]) < 10) {
                System.out.print("0" + (arr[i][3] * 10 + arr[i][4]) + " ");
            } else {
                System.out.print((arr[i][3] * 10 + arr[i][4]) + " ");
            }
        }

        for (int i = 22; i < 26; i++) {
            if ((arr[i][0] * 10 + arr[i][1]) < 10) {
                System.out.print("0" + (arr[i][0] * 10 + arr[i][1]) + " ");
            } else {
                System.out.print((arr[i][0] * 10 + arr[i][1]) + " ");
            }
        }
        System.out.println();
    }

    public void Question1() {
        int[][] arrg = sinhracacgiai();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hai chữ số  (00 đến 99): ");
        int x = sc.nextInt();
        System.out.println("Nhập số  tiền cược đơn vị (nghìn): ");
        int tiencuoc = sc.nextInt();
        int tienthang = 0, countde = 0, countlo = 0;
        System.out.println("Mời bạn lựa chọn đánh: ");
        System.out.println("1.Đánh đề: ");
        System.out.println("2.Đánh lô: ");
        int number = sc.nextInt();
        while (number != 1 && number != 2) {
            System.out.println("Vui lòng chọn lại bạn muốn 1.Đánh lô hay 2.Đánh đề: ");
            number = sc.nextInt();
        }
        sc.close();
        if (number == 1) {
            System.out.println("Bạn chọn đánh đề. ");
        } else if (number == 2) {
            System.out.println("Bạn chọn đánh lô. ");
        }
        Date date = new Date();
        System.out.println("Thời gian quay thưởng:  " + date);
        inracacgiai(arrg);
        inra2socuoigiai(arrg);
        switch (number) {
            case 1: {
                if (x == ((arrg[0][3] * 10 + arrg[0][4]))) {
                    System.out.println("Xin chúc mừng bạn đã trúng đề ");
                    tienthang = tiencuoc * 70;
                    System.out.println("Số bạn đã chọn là:  " + x);
                    System.out.println("Số tiền bạn nhận được là(nghìn): " + tienthang + ".000");
                    countde = 1;
                }
                break;
            }
            case 2: {
                for (int i = 1; i < 22; i++) {
                    if (x == (arrg[i][3] * 10 + arrg[i][4])) {
                        countlo++;
                    }
                }
                for (int i = 22; i < 26; i++) {
                    if (x == (arrg[i][0] * 10 + arrg[i][1])) {
                        countlo++;
                    }
                }
                if (countlo > 0) {
                    System.out.println("Xin chúc mừng bạn đã trúng lô ");
                    System.out.println("Số bạn đã chọn là: " + x);
                    tienthang = (tiencuoc * 80 * countlo) / 23;
                    System.out.println("Số tiền bạn nhận được là (nghìn): " + tienthang + ".000");
                }
                break;
            }
        }
        if (countde == 0 && countlo == 0) {
            System.out.println("Số bạn đã chọn là: " + x);
            System.out.println("Rất tiếc bạn không trúng giải");
        }

    }
}
