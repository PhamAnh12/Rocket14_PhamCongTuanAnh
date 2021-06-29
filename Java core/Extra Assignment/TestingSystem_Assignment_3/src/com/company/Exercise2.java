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
    public   static String nhaptk(){
        Scanner sc = new Scanner(System.in);
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
        System.out.println("Exercise2 Question2: ");
        String st = nhapchuoi();
        char [] stchar = st.toCharArray();
        int dem = 0;
        int[] arr = new int[stchar.length];
        for (int i = 0; i < stchar.length; i++){
            if(stchar[i] == 'a'){
                dem++;
                arr[i] = i+1;
            }
        }
        System.out.println("Số lần xuất hiện của sâu 'a' là: " + dem );
        System.out.println("Các vị trí xuất hiện của 'a': ");
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                System.out.print( arr[i]+" ");
            }

        }
    }
//    Question 3:
//    Thay kí tự x trong xâu s bởi kí tự y (s, x, y được đọc vào từ bàn phím)
    public  void  Question3(){
        System.out.println("Exercise2 Question3: ");
        Scanner sc = new Scanner(System.in);
        String st = nhapchuoi();
        System.out.println("Nhập ký tự x vào: ");
        String x = sc.nextLine();
        char [] xchar = x.toCharArray();
        System.out.println("Nhập ký tự y vào: ");
        String y = sc.nextLine();
        char [] ychar = y.toCharArray();
        sc.close();
        char []  stchar = st.toCharArray();
        for (int i = 0; i < stchar.length; i++){
            if(stchar[i] == xchar[0]){
                stchar[i] =  ychar[0];
            }
        }

        System.out.println("Chuỗi mới khi thay ký tự y = ký tự x: " +   String.copyValueOf(stchar) );
    }
//    Question 4:
//Hãy nhập một xâu kí tự. In ra màn hình đảo ngược của xâu đó.
    public  void  Qusetion4(){
        System.out.println("Exercise2 Question4: ");
        String st = nhapchuoi();
        StringBuffer stringBuffer = new StringBuffer(st);
        System.out.println(stringBuffer.reverse().toString());

    }
//    Question 5:
//Nhập xâu. Thống kê số các chữ số ‘0’, số chữ số ‘1’, …, số chữ số ‘9’
//trong xâu
    public  void  Question5(){
        System.out.println("Exercise2 Question5: ");
        String st  = nhapchuoi();
        char [] stchar = st.toCharArray();
        int []arrdem = new  int[10];
        for (int  i = 0 ; i < stchar.length; i++){
            if (stchar[i] == '0'){
                arrdem[0]++;
            }
            if (stchar[i] == '1'){
                arrdem[1]++;
            }
            if (stchar[i] == '2'){
                arrdem[2]++;
            }
            if (stchar[i] == '3'){
                arrdem[3]++;
            }
            if (stchar[i] == '4'){
                arrdem[4]++;
            }
            if (stchar[i] == '5'){
                arrdem[5]++;
            }
            if (stchar[i] == '6'){
                arrdem[6]++;
            }
            if (stchar[i] == '7'){
                arrdem[7]++;
            }
            if (stchar[i] == '8'){
                arrdem[8]++;
            }
            if (stchar[i] == '9'){
                arrdem[9]++;
            }

        }
        for (int i = 0; i < 10; i++){
            System.out.println("Số lần xuất hiện của chữ số " + i + " trong chuỗi là: " + arrdem[i] );
        }
    }
//    Question 6:
//Cho một chuỗi ký tự như sau: “Java – Nơi trí tưởng tượng bay xa”.
//Hãy chuyển chuỗi này thành một mảng, trong đó mỗi phần tử là một
//từ.
//Ví dụ a[0] = Java, a[1] = Nơi, a[2] = Trí,…
//Sau đó in kết quả ra màn hình
    public  void  Question6(){
        System.out.println("Exercise2 Question6: ");
        String st = "Java – Nơi trí tưởng tượng bay xa";
        String[] starr = {"Java", "Nơi", "trí", "tưởng", "tượng", "bay", "xa"};
        for (int i = 0; i < starr.length; i++){
            System.out.print(starr[i] + " ");
        }

    }
//Question 7:
//Viết chương trình kiểm tra mật khẩu người dùng khi đăng nhập.
//Người dùng phải đăng nhập khi đến khi nào đúng username và
//password thì thôi. (username và password được định nghĩa trước trong
//chương trình)

    public  void  Question7(){
        System.out.println("Exercise2 Question7: ");
        System.out.println("Nhập User: ");
        String user = nhaptk();
        System.out.println("Nhập Password: ");
        String password = nhaptk();
        String user1 = "phamanh123", password1 = "12345678";
        int count = 0;
        while (true){
            if (user.equals(user1) == false && password.equals(password1) == false){
                System.out.println("Bạn nhập User Password sai vui lòng nhập lại. ");
                System.out.println("Nhập User: ");
                user = nhaptk();
                System.out.println("Nhập Password: ");
                password = nhaptk();
                count++;
            }
            if(user.equals(user1) == false ){
                System.out.println("Bạn nhập User sai vui lòng nhập lại. ");
                System.out.println("Nhập User: ");
                user = nhaptk();
                System.out.println("Nhập Password: ");
                password = nhaptk();
                count++;
            }
            if (user.equals(user1) && password.equals(password1) == false){
                System.out.println("Bạn nhập Password sai vui lòng nhập lại. ");
                System.out.println("Nhập Password: ");
                password = nhaptk();
                count++;
            }

            if (user.equals(user1) && password.equals(password1)){
                System.out.println("Đăng nhập thành công. ");
                break;
            }
            if (count >= 5){
                System.out.println("Bạn nhập sai quá 5 lần nhập. ");
                break;
            }
        }
    }
}
