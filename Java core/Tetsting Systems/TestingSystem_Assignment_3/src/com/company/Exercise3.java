package com.company;

public class Exercise3 {
    //    Question 1:
//Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//Sau đó convert lương ra float và hiển thị lương lên màn hình (với số
//float có 2 số sau dấu thập phân)
    public void Question1() {
        System.out.println("Exercise3 Question1: ");
        Integer salary = 5000;
        System.out.printf("%2.2f", (float) salary);
    }

    //    Question 2:
//Khai báo 1 String có value = "1234567"
//Hãy convert String đó ra số int
    public void Question2() {
        System.out.println("Exercise3 Question2: ");
        String st = "1234567";
        int stint = Integer.parseInt(st);
        System.out.println(stint);

    }

    //Question 3:
//Khởi tạo 1 số Integer có value là chữ "1234567"
//Sau đó convert số trên thành datatype int
    public void Question3() {
        System.out.println("Exercise3 Question3: ");
        Integer integer = 1234567;
        int it = integer.intValue();
    }

}
