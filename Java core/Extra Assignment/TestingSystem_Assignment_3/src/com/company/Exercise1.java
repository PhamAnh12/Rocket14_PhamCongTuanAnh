package com.company;

import java.util.Scanner;

public class Exercise1 {

    public static int nhapsoN() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài n số thực: ");
        int n = sc.nextInt();
        return n;
    }

    public static double[] nhapdaythuc(int n) {
        Scanner sc = new Scanner(System.in);
        double[] arrdb = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị thứ: " + (i + 1));
            arrdb[i] = sc.nextDouble();
        }
        return arrdb;
    }

    public static int[] nhapdaynguyen(int n) {
        Scanner sc = new Scanner(System.in);
        int[] arrdb = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập giá trị thứ: " + (i + 1));
            arrdb[i] = sc.nextInt();
        }
        return arrdb;
    }

    public static void inradaynguyen(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Giá trị thứ: " + (i + 1) + ": " + arr[i]);
        }

    }

    public static int[] sapxepinttangdan(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j ] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] sapxepintgiamdan(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
//Question 1:
//Nhập vào dãy n số thực. Tính tổng dãy, trung bình dãy, tổng các số âm,
//dương và tổng các số ở vị trí chẵn, vị trí lẻ trong dãy
    public void Question1() {
        System.out.println("Exercise1 Question1: ");
        Scanner sc = new Scanner(System.in);
        int n = nhapsoN();
        double[] arrdb = nhapdaythuc(n);
        double sum = 0, avg = 0, sumam = 0, sumduong = 0, sumchan = 0, sumle = 0;

        sc.close();
        for (int i = 0; i < n; i++) {
            sum = sum + arrdb[i];
            if (arrdb[i] < 0) {
                sumam = sumam + arrdb[i];
            }
            if (arrdb[i] > 0) {
                sumduong = sumduong + arrdb[i];
            }
            if (i % 2 == 0) {
                sumchan = sumchan + arrdb[i];
            }
            if (i % 2 != 0) {
                sumle = sumle + arrdb[i];
            }
        }
        avg = (double) sum / n;
        System.out.println("Tổng của dãy : " + sum);
        System.out.println("Trung bình của dãy : " + avg);
        System.out.println("Tổng của các số âm : " + sumam);
        System.out.println("Tổng của các số dương : " + sumduong);
        System.out.println("Tổng của  các số  có vị trí chẵn: " + sumchan);
        System.out.println("Tổng của  các số có vị trí lẻ  : " + sumle);


    }

    //Question 2:
//Tìm và chỉ ra vị trí xuất hiện đầu tiên của phần tử x trong dãy.
    public void Question2() {
        System.out.println("Exercise1 Question2: ");
        Scanner sc = new Scanner(System.in);
        int n = nhapsoN();
        double[] arr = nhapdaythuc(n);
        System.out.println("Nhập số x cần tìm vị trí: ");
        double x = sc.nextDouble();
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                System.out.println("Vị trí cần tìm: " + (i + 1));
            } else {
                System.out.println("  x không có trong mảng: ");
            }
        }
    }

    //    Question 3:
//Hãy nhập vào 16 số nguyên. In ra thành 4 dòng, 4 cột
    public void Question3() {
        System.out.println("Exercise1 Question3: ");
        int[] arr = nhapdaynguyen(16);
        for (int i = 0; i < 16; i++) {
            System.out.print(arr[i] + "  ");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }

    }

    //    Question 4:
//Nhập vào dãy số. In ra dãy đã được sắp xếp tăng dần, giảm dần
    public void Question4() {
        System.out.println("Exercise1 Question4: ");
        int n = nhapsoN();
        int[] arr = nhapdaynguyen(n);
        sapxepinttangdan(arr);
        System.out.println("Dãy sắp tăng dần: ");
        inradaynguyen(arr);
        sapxepintgiamdan(arr);
        System.out.println("Dãy sắp giảm dần: ");
        inradaynguyen(arr);
    }
//    Question 5:
//Cho một dãy các số sau: 10, 20, 90, 50, 100, 60, 30, 80, 70, 40.
//Hãy sắp xếp các dãy này theo chiều tăng dần, giảm dần
//Yêu cầu:
//Thiết kế giao diện console nhập từng phần tử và hiển thị kết
//quả ra màn hình.
//Sau khi nhập đủ 10 phần tử theo đúng thứ tự như đề bài thì
//thực hiện sắp xếp theo chiều tăng dần, giảm dần
    public  void  Question5(){
        System.out.println("Exercise1 Question5: ");
        int [] arr = nhapdaynguyen(10);
        inradaynguyen(arr);
        System.out.println("Dãy sắp tăng dần: ");
        sapxepinttangdan(arr);
        inradaynguyen(arr);
        System.out.println("Dãy sắp giảm dần: ");
        sapxepintgiamdan(arr);
        inradaynguyen(arr);
    }

}
