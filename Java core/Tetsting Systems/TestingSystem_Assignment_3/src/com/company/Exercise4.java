package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Exercise4 {
    public String nhapsau() {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        return st;
    }

    public void inarrstring(String[] starr) {
        for (int i = 0; i < starr.length; i++) {
            System.out.print(starr[i] + " ");
        }
    }

    //Question 1:
//Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có
//thể cách nhau bằng nhiều khoảng trắng );
    public void Question1() {
        System.out.println("Exercise4 Question1: ");
        System.out.println("Nhập chuỗi: ");
        String st = nhapsau();
        String[] starr = st.split(" ");
        System.out.println("Số kí tự: " + starr.length);

    }

    //    Question 2:
//    Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
    public void Question2() {
        System.out.println("Exercise4 Question2: ");
        System.out.println("Nhập chuỗi s1: ");
        String s1 = nhapsau();
        System.out.println("Nhập chuỗi s2: ");
        String s2 = nhapsau();
        System.out.println("Chuỗi nối s1 + s2: " + (s1 + " " + s2));

    }

    //    Question 3:
//Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư
//viết hoa chữ cái đầu thì viết hoa lên
    public void Question3() {
        System.out.println("Exercise4 Question3: ");
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Nhập Tên: ");
        name = scanner.nextLine();
        String firstCharacter = name.substring(0, 1).toUpperCase();
        String leftCharacter = name.substring(1);
        System.out.println("char at:" + name.charAt(1));
        name = firstCharacter + leftCharacter;
        System.out.println(name);
        scanner.close();
    }

    //    Question 4:
//Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên
//của người dùng ra
//VD:
//Người dùng nhập vào "Nam", hệ thống sẽ in ra
//"Ký tự thứ 1 là: N"
//"Ký tự thứ 1 là: A"
//"Ký tự thứ 1 là: M"
    public void Question4() {
        System.out.println("Exercise4 Question4: ");
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Nhập Tên: ");
        name = scanner.nextLine();

        char[] namechar = name.toUpperCase().toCharArray();
        for (int i = 0; i < namechar.length; i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " " + namechar[i]);
        }
    }

    //Question 5:
//Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người
//dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
    public void Question5() {
        System.out.println("Exercise4 Question5: ");
        Scanner scanner = new Scanner(System.in);
        String firstname, lastname;
        System.out.println("Nhập Họ: ");
        firstname = scanner.nextLine();
        System.out.println("Nhập tên: ");
        lastname = scanner.nextLine();
        System.out.println("Họ và tên: " + firstname + " " + lastname);

    }

    //Question 6:
//Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//VD:
//Người dùng nhập vào "Nguyễn Văn Nam"
//Hệ thống sẽ in ra
//"Họ là: Nguyễn"
//"Tên đệm là: Văn"
//"Tên là: Nam"
    public void Question6() {
        System.out.println("Exercise4 Question5: ");
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Nhập Họ tên đầy đủ: ");
        name = scanner.nextLine();
        String[] namearr = name.split(" ");
        System.out.println("Họ là: " + namearr[0]);
        System.out.println("Tên đệm là: ");
        for (int i = 1; i <= namearr.length - 2; i++) {
            System.out.print(namearr[i] + " ");
        }
        System.out.println();
        System.out.println("Tên là: " + namearr[namearr.length - 1]);

    }

    //    Question 7:
//Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và
//chuẩn hóa họ và tên của họ như sau:
//a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập
//vào
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//    chuẩn hóa thành "nguyễn văn nam"
//    b) Viết hoa chữ cái mỗi từ của người dùng
//    VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ
//    chuẩn hóa thành "Nguyễn Văn Nam"
    public void Question7() {
        System.out.println("Exercise4 Question7: ");
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.println("Nhập Họ tên đầy đủ: ");
        name = scanner.nextLine();
        scanner.close();
        System.out.println("Họ tên  câu a: " + name.strip().replaceAll("\\s+", " "));
        String[] namearr = name.split(" ");
        name = "";
        for (int i = 0; i < namearr.length; i++) {
            String st1 = namearr[i].substring(0, 1).toUpperCase();
            String st2 = namearr[i].substring(1);
            String name1 = st1 + st2;
            name += name1 + " ";
        }
        System.out.println("Họ tên  câu b: " + name);

    }

    //   Question 8:
//In ra tất cả các group có chứa chữ "Java"
    public void Question8() {
        System.out.println("Exercise4 Question8: ");
        String[] groupname = {"Java 123", "Java 321", "Hội Đảo mèo", "Chủng tộc ngáo Husky"};
        for (String group : groupname) {
            if (group.contains("Java")) {
                System.out.println(group);
            }

        }
    }

    //    Question 9:
//In ra tất cả các group "Java"
    public void Question9() {
        System.out.println("Exercise4 Question9: ");
        String[] groupname = {"Java", "C++", "C#", "Chủng tộc ngáo Husky"};
        for (String group : groupname) {
            if (group.equals("Java")) {
                System.out.println(group);
            }

        }
    }

    //    Question 10 (Optional):
//Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
//Nếu có xuất ra “OK” ngược lại “KO”.
//Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau
    public void Question10() {
        System.out.println("Exercise4 Question10: ");
        System.out.println("Nhập chuỗi thứ nhất: ");
        String st1 = nhapsau();
        System.out.println("Nhập chuỗi thứ hai: ");
        String st2 = nhapsau();
        String st1new = "";
        for (int i = st1.length() - 1; i >= 0; i--) {
            st1new += st1.substring(i, i + 1);
        }

        if (st1new.equals(st2)) {
            System.out.println("Hai chuỗi là đảo ngược của nhau. ");
        } else {
            System.out.println("Hai chuỗi là không  đảo ngược của nhau. ");
        }

    }

    //Question 11 (Optional): Count special Character
//Tìm số lần xuất hiện ký tự "a" trong chuỗi
    public void Question11() {
        System.out.println("Exercise4 Question11: ");
        System.out.println("Nhập chuỗi : ");
        String st = nhapsau();
        int count = 0;
        char[] starr = st.toCharArray();
        for (int i = 0; i < starr.length; i++) {
            if (starr[i] == 'a') {
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của ký tự 'a': " + count);

    }

    //Question 12 (Optional): Reverse String
    //Đảo ngược chuỗi sử dụng vòng lặp
    public static void Question12() {
        System.out.println("Exercise4 Question12: ");
        Scanner scanner = new Scanner(System.in);
        String s1, reverseS1 = "";
        System.out.println("Nhập chuỗi ");
        s1 = scanner.nextLine();
        for (int i = s1.length() - 1; i >= 0; i--) {
            reverseS1 += s1.charAt(i);
        }
        System.out.println(reverseS1);
        scanner.close();
    }

    //    Question 13 (Optional): String not contains digit
//Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược
//lại true.
//Ví dụ:
//"abc" => true
//"1abc", "abc1", "123", "a1bc", null => false
    public static boolean checkKeyNumber(char ch) {
        if (ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    public void Question13() {
        System.out.println("Exercise4 Question13: ");
        System.out.println("Nhập chuỗi : ");
        String st = nhapsau();
        for (int i = 0; i < st.length(); i++) {
            if (checkKeyNumber(st.charAt(i))) {
                System.out.println("Fale");
                return;
            }
        }
        System.out.println("True");
    }

    //    Question 14 (Optional): Replace character
//Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác
//cho trước.
//Ví dụ:
//"VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"
    public String chuyenchuoi(String st, char x) {
        char[] starrchar = st.toCharArray();
        for (int i = 0; i < starrchar.length; i++) {
            if (x == starrchar[i]) {
                starrchar[i] = '*';
            }
        }
        st = String.valueOf(starrchar);
        return st;
    }

    public void Question14() {
        System.out.println("Exercise4 Question14: ");
        System.out.println("Nhập chuỗi : ");
        String st = nhapsau();
        char x = 'x';
        String[] starr = st.split(" ");
        for (int i = 0; i < starr.length; i++) {
            starr[i] = chuyenchuoi(starr[i], x);
            System.out.print(starr[i] + " ");
        }
    }
//Question 15 (Optional): Revert string by word
//Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng
//thư viện.
//Ví dụ: " I am developer " => "developer am I".
//Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
//Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt
//chuỗi theo dấu cách
    public  void  Question15(){
        System.out.println("Exercise4 Question15: ");
        System.out.println("Nhập chuỗi : ");
        String st = nhapsau();
        String [] starr = st.trim().split(" ");
        System.out.println("Chuỗi đảo ngược : ");
        for (int i = starr.length-1; i >=0; i--){
            System.out.print(starr[i] + " ");
        }
    }
//    Question 16 (Optional):4
//Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần
//bằng nhau với n ký tự. Nếu chuỗi không chia được thì xuất ra màn
//hình “KO”.
    public  void  Question16(){
        System.out.println("Exercise4 Question16: ");
        Scanner scanner = new Scanner(System.in);
        String str;
        int n;
        System.out.println("Nhập chuỗi: ");
        str = scanner.nextLine();
        System.out.println("Nhập n: ");
        n = scanner.nextInt();
        scanner.close();
        if (str == null || str.isEmpty() || str.length() % n != 0) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < str.length(); i +=n){
            System.out.print(str.substring(i,i+n) + " ");
        }
    }
}

