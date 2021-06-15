import java.util.*;
import java.util.concurrent.ForkJoinPool;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Exercise2 {
    //    ham nhap mang
    public static double[] Nhaparr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài dãy số thực: ");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập  số thực " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();

        }
        return arr;
    }

    // Kiểm tra số nguyên tố
    public static boolean KTSTNT(int n) {

        if (n < 2) {
            System.out.println("Vui lòng nhập lại số n: ");

        } else {
            for (int i = 2; i <= sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }

            }

        }
        return true;

    }

    //    hàm sắp xếp tăng dần
    public static double[] SapxepDesc() {
        double[] arrd = Nhaparr();
        double temp = 0;
        for (int i = 0; i < arrd.length; i++) {
            for (int j = i + 1; j < arrd.length; j++) {
                if (arrd[i] > arrd[j]) {
                    temp = arrd[j];
                    arrd[j] = arrd[i];
                    arrd[i] = temp;
                }
            }

        }
        return arrd;
    }

    //  ham dem
    public static int dem(double[] a, int n, double x) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                count++;
            }
        }
        return count;
    }

    // in ra mang
    public void Inarr() {
        double[] arrin = SapxepDesc();
        for (int i = 0; i < arrin.length; i++) {
            System.out.println("Phần tử mảng thứ" + (i + 1) + ":" + arrin[i]);
        }
    }

    //    Question 1:
//Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
//Hãy liệt kê các phần tử xuất hiện trong dãy đúng một lần
    public void Question1() {
        System.out.println("Exercise2 Question1: ");
        double[] arr = SapxepDesc();
        System.out.print("Các số xuất hiện đúng 1 lần là: ");
        for (int i = 0; i < arr.length; i++) {
            if (dem(arr, arr.length, arr[i]) == 1) {
                System.out.print(arr[i] + " ");
            }

        }


    }

    //    Question 2:
//Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1.
//Hãy liệt kê các phần tử xuất hiện trong dãy đúng 2 lần.
    public void Question2() {
        System.out.println("Exercise2 Question2: ");
        double[] arr = SapxepDesc();
        System.out.print("Các số xuất hiện đúng 2  lần là: ");
        for (int i = 0; i < arr.length; i++) {
            if (dem(arr, arr.length, arr[i]) == 2 && dem(arr, i, arr[i]) == 0) {
                System.out.print(arr[i] + " ");
            }

        }

    }

    //    Question 3:
//Nhập số liệu cho dãy số thực a0 , a1 ,..., an-1 .
//In ra màn hình số lần xuất hiện của các phần tử.
    public void Question3() {
        System.out.println("Exercise2 Question3: ");
        double[] arr = SapxepDesc();
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            {
                count = dem(arr, arr.length, arr[i]);
                if (count == 1) {
                    System.out.print("Phần tử thứ " + " " + arr[i] + " Số lần xuất hiện: " + count + "\n");
                    i++;
                } else {
                    System.out.print("Phần tử thứ " + " " + arr[i] + " Số lần xuất hiện: " + count + "\n");
                    i = i + count;
                }
            }

        }


    }

    //  Hàm Nhập số nguyên
    public static int InputInt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        int n = sc.nextInt();
        sc.close();
        return n;
    }

    //     Question 4:
//Hãy viết chương trình tính tổng các chữ số của một số nguyên bất kỳ.
//Ví dụ: Số 8545604 có tổng các chữ số là: 8+5+4+5+6+0+4= 32
    public int Question4(int n) {
        System.out.println("Exercise2 Question4: ");
        int sum = 0;
        int i;
        while (n != 0) {
            i = n % 10;
            sum += i;
            n = n / 10;
        }

        return sum;

    }

    //    Question 5:
//Viết chương trình phân tích một số nguyên thành các thừa số nguyên tố
//Ví dụ: Số 28 được phân tích thành 2 x 2 x 7
    public void Question5() {
        System.out.println("Exercise2 Question5: ");
        int n = InputInt();
        int i = 2;

        if (KTSTNT(n)) {
            System.out.println("Dạng số là:" + n);
        } else {
            while (n > 2) {
                if (n % i == 0) {
                    System.out.print(i + ".");
                    n = n / i;
                } else i++;
            }

        }

    }

    //    Question 6:
//Viết chương trình liệt kê tất cả các số nguyên tố nhỏ hơn n cho trước.
    public void Question6() {
        System.out.println("Exercise2 Question6: ");
        int n = InputInt();
        System.out.println("Các số nguyên tố nhỏ hơn n:  ");
        System.out.print("2 ");
        for (int j = 3; j < n; j = j + 2) {
            if (KTSTNT(j)) {
                System.out.print(j + " ");
            }
        }
    }

    //    Question 7:
//Viết chương trình liệt kê n số nguyên tố đầu tiên.
    public void Question7() {
        System.out.println("Exercise2 Question7: ");
        int n = InputInt();
        System.out.println("n số nguyên tố đầu tiên :  ");
        if (n == 1) {
            System.out.print("2 ");
        } else {
            int dem = 1;
            int x = 3;
            System.out.print("2 ");
            while (true) {
                if (dem == n) {
                    return;
                } else {
                    if (KTSTNT(x)) {
                        System.out.print(x + " ");
                        x = x + 2;
                        dem++;
                    } else {
                        x = x + 2;
                    }
                }
            }
        }
    }

    //    Question 8:
//Viết chương trình tìm ước số chung lớn nhất, bội số chung nhỏ nhất của hai số
//tự nhiên a và b.
    public void Qustion8() {
        System.out.println("Exercise2 Question8: ");
        System.out.print("Nhập số x ");
        int x = InputInt();
        int a = x;
        System.out.print("Nhập số y ");
        int y = InputInt();
        int b = y;
        int UCLN = 0;
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            if (b > a) {
                b = b - a;
            }
        }
        UCLN = a;

        System.out.println("Ước chung Lớn nhất " + UCLN);
        System.out.println("Bội chung chung nhỏ nhất " + (x * y) / UCLN);

    }

    //  Question 9:
//Dãy số Fibonacci được định nghĩa như sau:
//F0 =1, F1 = 1; Fn = Fn-1 + Fn-2 với n>=2.
//Hãy viết chương trình tìm số Fibonacci thứ n.
    public static int[] soFibonacci(int n) {
        if (n < 2) {
            System.out.println("Vui lòng nhập lại số n >=2: ");
            n = InputInt();
        }
        int[] arrint = new int[n];
        arrint[0] = 1;
        arrint[1] = 1;
        for (int i = 2; i < n; i++) {
            arrint[i] = arrint[i - 2] + arrint[i - 1];
        }
        return arrint;
    }

    public void Question9() {
        System.out.println("Exercise2 Question9: ");
        int n = InputInt();
        int[] arrint = soFibonacci(n);

        System.out.println("Số Fibonacci thứ " + n + ": " + arrint[n - 1]);
    }

    // Question 10:
//Một số được gọi là số thuận nghịch độc nếu ta đọc từ trái sang phải hay từ
//phải sang trái số đó ta vẫn nhận được một số giống nhau.
//Hãy liệt kê tất cả các số thuận nghịch độc có sáu chữ số (Ví dụ số: 558855).
    public static boolean isThuanNghich(int n) {
        List<Integer> listNumbers = new ArrayList<>();
        // phân tích số n thành các chữ số và lưu vào listNumbers
        do {
            listNumbers.add(n % 10);
            n = n / 10;
        } while (n > 0);
        // kiểm tra tính thuận nghịch
        int size = listNumbers.size();
        for (int i = 0; i < (size / 2); i++) {
            if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public void Question10() {
        System.out.println("Exercise2 Question10: ");
        int count = 0;
        for (int i = 100000; i < 1000000; i++) {
            if (isThuanNghich(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
        System.out.println("Tổng số thuận nghịch:  " + count);
    }

    //    Question 11:
//Viết chương trình liệt kê tất cả các hoán vị của 1, 2, .., n.
//    Question 12:
//Nhập số liệu cho 2 dãy số thực a0 , a1 ,..., am-1 và b0 , b1 ,..., bn-1. Giả sử
//cả 2 dãy này đã được sắp theo thứ tự tăng dần.
//Hãy tận dụng tính sắp xếp của 2 dãy và tạo dãy c0 , c1 ,..., cm+n-1 là hợp của
//2 dãy trên, sao cho dãy ci cũng có thứ tự tăng dần .
    public static void sortASC(float[] arr) {
        float temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void Question12() {
        int m = InputInt();
        int n = InputInt();
        float[] a = new float[m];
        float[] b = new float[n];

        Scanner sca = new Scanner(System.in);
        Scanner scb = new Scanner(System.in);
        System.out.println("Nhập dãy thực tăng đân: ");
        for (int i = 0; i < m; i++) {
            a[i] = sca.nextFloat();
        }
        System.out.println("Nhập dãy thực tăng đân: ");
        for (int i = 0; i < n; i++) {
            b[i] = scb.nextInt();
        }
        sortASC(a);
        sortASC(b);
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        float[] c = new float[cIndex + 1];

        // sắp xếp các mảng theo thứ tự tăng dần

        // trộn mảng a và b thành c
        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (a[aIndex] > b[bIndex]) {
                    c[i] = a[aIndex--];
                } else {
                    c[i] = b[bIndex--];
                }
            } else if (bIndex == -1) {
                c[i] = a[aIndex--];
            } else if (aIndex == -1) {
                c[i] = b[bIndex--];
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");

        }
    }

    //Question 13:
//Nhập số n và dãy các số thực a0 , a1 ,..., an-1. Không đổi chỗ các phần tử và
//không dùng thêm mảng số thực nào khác (có thể dùng mảng số nguyên nếu
//cần)
//Hãy cho hiện trên màn hình dãy trên theo thứ tự tăng dần
    public static int viTriMinFloat(float a[], int n) {
        float min = a[0];
        int key = 0;
        for (int j = 0; j < n; j++) {
            if (min > a[j]) {
                min = a[j];
                key = j;
            }
        }
        return (key);

    }

    public static float maxFloat(float a[], int n) {
        float max = a[0];
        for (int j = 0; j < n; j++) {
            if (max < a[j]) max = a[j];
        }
        return (max);

    }

    public void Question13() {
        System.out.println("Exercise2 Question13: ");
        int n = InputInt();
        float[] a = new float[n];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập dãy thực : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextFloat();
        }
        sc.close();
        System.out.println("Sap xep theo thu tu tang dan");
        int j = 0;
        while (j < n) {
            System.out.println(" " + a[viTriMinFloat(a, n)]);
            a[viTriMinFloat(a, n)] = maxFloat(a, n);
            j++;
        }


    }

    //Question 14:
//Nhập một số tự nhiên n.
//Hãy liệt kê các số Fibonaci nhỏ hơn n là số nguyên tố
    public void Question14() {
        System.out.println("Exercise2 Question14: ");
        int n = InputInt();
        int arr[] = soFibonacci(n);
        System.out.print(" Các số Fibonacii lá số nguyên tố là : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                System.out.print(" 2 ");
            }
            if (arr[i] > 2) {
                if (KTSTNT(arr[i])) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    //    Question 15:
//Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng
//sau:
//a) Tính tổng các chữ số của n.
//b) Phân tích n thành các thừa số nguyên tố.
    public void Question15() {
        System.out.println("Exercise2 Question14: ");
        int n = InputInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Tổng  các chữ số của n: " + sum);
        int i = 2;
        while (n > 1) {
            if (KTSTNT(i)) {
                if (n % i == 0) {
                    System.out.print(i + ".");
                    n /= i;
                } else i++;
            } else i++;
        }
    }

    //    Question 16:
//Viết chương trình nhập một số nguyên dương n và thực hiện các chức năng sau:
//a) Liệt kê các ước số của n. Có bao nhiêu ước số.
//b) Liệt kê các ước số là nguyên tố của n.
    public void Question16() {
        System.out.println("Exercise2 Question16: ");
        int n = InputInt();
        int count = 0;
        System.out.println("Ước của n là:  ");
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nSố uóc của n là  :  " + count);
        System.out.println("Số uóc của n là số nguyên tố :  " + count);
        for (int i = 2; i < n; i++) {
            if (n % i == 0 && KTSTNT(i)) {
                System.out.print(i + " ");
            }
        }

    }

    //    Question 17:
//Viết chương trình liệt kê các số nguyên có 7 chữ số thoả mãn:
//a) Là số nguyên tố.
//b) Là số thuận nghịch.
//c) Tổng các chữ số của số đó là một số thuận nghịch
    public void Question17() {
        long sum = 0;
        System.out.println("Exercise2 Question17: ");
        System.out.println("a) Là số nguyên tố.: ");
        for (int i = 1000000; i < 10000000; i++) {

            if (KTSTNT(i) && isThuanNghich(i)) {
                System.out.println(i);
                sum = sum + i;
            }
        }

        System.out.print("\nc) Tổng các chữ số của số đó là một số thuận nghịch: " + sum);
    }

    //    Question 18:
//Viết chương trình nhập vào vào mảng A có n phần tử
//(các phần tử là những số nguyên lớn hơn 0 và nhỏ hơn 100 được nhập vào từ
//bàn phím. )4
//Thực hiện các chức năng sau:
//a) Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
//b) Sắp xếp mảng theo thứ tự giảm dần .
//c) Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính
//sắp xếp giảm dần.
    public static int[] Nhaparrint() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài dãy số nguyên  lớn hơn 0 nhỏ hơn 100: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập  số nguyên " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

        }
        return arr;
    }

    public static void sortAscint(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void inarrint(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Số nguyên  thứ: " + (i + 1) + ": ");
            System.out.println(arr[i]);

        }

    }

    public static int vitrimax(int arr[]) {
        int key = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                key = i;
            }
        }
        return key;
    }

    public static int vitrimax2(int arr[]) {
        int key = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max && i != vitrimax(arr)) {
                max = arr[i];
                key = i;
            }
        }
        return key;
    }

    public static void themPhanTu(int[] arr, int n, int x) {
        arr[0] = x;
        sortAscint(arr);
    }

    public void Question18() {
        System.out.println("Exercise2 Question18: ");
        int[] arr = Nhaparrint();
        //a) Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
        System.out.println("Số nguyên  max: " + arr[vitrimax(arr)] + " Vị trí max: " + (vitrimax(arr) + 1));
        System.out.println("Số nguyên  max 2: " + arr[vitrimax2(arr)] + " Vị trí max: " + (vitrimax2(arr) + 1));
        //b) Sắp xếp mảng theo thứ tự giảm dần .
        System.out.println("b) Sắp xếp mảng theo thứ tự giảm dần : ");
        sortAscint(arr);
        inarrint(arr);
//        c) Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính
//sắp xếp giảm dần.
        System.out.println(" Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính sắp xếp giảm dần: ");
        int x = InputInt();
        themPhanTu(arr, arr.length + 1, x);
        inarrint(arr);

    }

    // Question 19:
//Viết chương trình nhập vào vào mảng A có n phần tử, các phần tử là những số
//nguyên lớn hơn 0 và nhỏ hơn 100 được nhập vào từ bàn phím.
//Thực hiện các chức năng sau:
//a) Tìm phần tử lớn nhất và lớn thứ 2 trong mảng cùng chỉ số của các số đó.
//b) Sắp xếp mảng theo thứ tự giảm dần .
//c) Nhập một số nguyên x và chèn x vào mảng A sao cho vẫn đảm bảo tính
//sắp xếp giảm dần.
//    Question 20:
//Viết chương trình thực hiện chuẩn hoá một xâu ký tự nhập từ bàn phím (loại bỏ
//các dấu cách thừa, chuyển ký tự đầu mỗi từ thành chữ hoa, các ký tự khác thành
//chữ thường)
    public void Question20() {
        System.out.println("Exercise2 Question20: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi vào: ");
        String st = sc.nextLine();
        String message = st.replaceAll("\\s\\s+", " ").trim();
        char[] charArray = message.toCharArray();
        boolean foundSpace = true;
        //sử dụng vòng lặp for để duyệt các phần tử trong charArray
        for (int i = 0; i < charArray.length; i++) {
            // nếu phần tử trong mảng là một chữ cái
            if (Character.isLetter(charArray[i])) {
                // kiểm tra khoảng trắng có trước chữ cái
                if (foundSpace) {
                    //đổi chữ cái thành chữ in hoa bằng phương thức toUpperCase()
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        // chuyển đổi mảng char thành string
        message = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + message);


    }

    //    Question 21:
//Viết chương trình thực hiện nhập một xâu ký tự
//a) Tìm từ dài nhất trong xâu đó.
//b) Từ đó xuất hiện ở vị trí nào?
//(Chú ý. nếu có nhiều từ có độ dài giống nhau thì chọn từ đầu tiên tìm
//thấy).
    public static void Question21(){
        System.out.println("Exercise2 Question20: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một chuỗi vào: ");
        String strInput = sc.nextLine();
        sc.close();
        StringTokenizer strToken= new StringTokenizer(strInput," ,\t,\r");
        int Max,i=1,lengthStr;
        Max= strToken.nextToken().length();
        int viTriMax= i;
        while(strToken.hasMoreTokens()){
            lengthStr= strToken.nextToken().length();
            i++;
            if(Max < lengthStr){
                Max= lengthStr;
                viTriMax= i;
            }
        }
        System.out.println("Do dai xau lon nhat la: "+Max+" o vi tri "+viTriMax);
    }
}



