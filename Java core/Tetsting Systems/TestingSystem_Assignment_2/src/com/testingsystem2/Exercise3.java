package com.testingsystem2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Exercise3 {
//    Question 1: In ra thông tin Exam thứ 1 và property create date sẽ được format theo định dạng vietnamese
    public    void Question1(Exam ex1){
        System.out.println("Exercise3 Question 1: ");
        DateFormat df = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy ");
        String dateString  = df.format(ex1.createdate);
        System.out.println("Create Date của Exam1: "+ dateString);
    }
//    Question 2:  In ra thông tin: Exam đã tạo ngày nào theo định dạng
//Năm – tháng – ngày – giờ – phút – giây
    public    void Question2(Exam [] ExArr){
        System.out.println("Exercise3 Question 2: ");
        DateFormat df = new SimpleDateFormat("HH-mm-ss-dd-MM-yyyy ");
        for (int i =0; i < ExArr.length; i++){
            String dateString  = df.format(ExArr[i].createdate);
            System.out.println("Create Date của Exam "+ (i+1)+": " + dateString);

        }
    }
//    Question 3: Chỉ in ra năm của create date property trong Question 2
    public    void Question3(Exam [] ExArr) {
        System.out.println("Exercise3 Question 3: ");
        DateFormat df = new SimpleDateFormat("yyyy ");
        for (int i = 0; i < ExArr.length; i++) {
            String dateString = df.format(ExArr[i].createdate);
            System.out.println(" Year Create Date của Exam " + (i + 1) + ": " + dateString);

        }
    }
//Question 4: Chỉ in ra tháng và năm của create date property trong Question 2

    public    void Question4(Exam [] ExArr){
        System.out.println("Exercise3 Question 4: ");
        DateFormat df = new SimpleDateFormat("MM-yyyy ");

        for (int i =0; i < ExArr.length; i++){
            String dateString  = df.format(ExArr[i].createdate);
            System.out.println(" Month Year Create Date của Exam "+ (i+1)+": " + dateString);

        }
    }
//   Question 5 Chỉ in ra "MM-DD" của create date trong Question 2
    public    void Question5(Exam [] ExArr){
        System.out.println("Exercise3 Question 5: ");
        DateFormat df = new SimpleDateFormat("MM-dd");

        for (int i =0; i < ExArr.length; i++){
            String dateString  = df.format(ExArr[i].createdate);
            System.out.println(" Month Day Create Date của Exam "+ (i+1)+": " + dateString);

        }
    }

}
