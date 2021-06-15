package com.testingsystem2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Program {

    public static void main(String[] args) {

        // Tạo Department
        Department dep1 = new Department();
        dep1.id = 1;
        dep1.name = "Marketing";
        Department dep2 = new Department();
        dep2.id = 2;
        dep2.name = "Sale";
        Department dep3 = new Department();
        dep3.id = 3;
        dep3.name = "BOD";

        // Tạo Position

        Position pos1 = new Position();
        pos1.id = 1;
        pos1.name = Position.PositionName.Dev;
        Position pos2 = new Position();
        pos2.id = 2;
        pos2.name = Position.PositionName.PM;
        Position pos3 = new Position();
        pos3.id = 3;
        pos3.name = Position.PositionName.Scrum;

// Tạo Group

        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Testing System";
        group1.createdate = LocalDate.of(2021, 05, 28);
        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Development";

        group2.createdate = LocalDate.of(2021, 05, 15);
        Group group3 = new Group();
        group3.id = 3;
        group3.name = "Sale";
        group3.createdate = LocalDate.of(2021, 04, 15);

// Tạo Account

        Account acc1 = new Account();
        acc1.id = 1;
        acc1.email = "nguyenvananh@gmail.com";
        acc1.username = "nguyenvananh";
        acc1.fullname = "Nguyen Van Anh";
        acc1.department = dep1;
        acc1.position = pos1;
        acc1.createdate = LocalDate.now();
        Group[] groupAcc1 = new  Group[10];
        groupAcc1[1] = group1;
        groupAcc1[2] = group2;
        acc1.groups = groupAcc1;
        Account acc2 = new Account();
        acc2.id = 2;
        acc2.email = "phamvanbinh@gmail.com";
        acc2.username = "phamvanbinh123";
        acc2.fullname = "Pham Van Binh";
        acc2.department = dep2;
        acc2.position = pos2;
        acc2.createdate = LocalDate.of(2021, 04, 17);
        acc2.groups = new Group[]{group3, group2};
        Account acc3 = new Account();
        acc3.id = 3;
        acc3.email = "nguyencongchi@gmail.com";
        acc3.username = "nguyencongchi123";
        acc3.fullname = "Nguyen Cong Chi";
        acc3.department = dep3;
        acc3.position = pos3;
        acc3.createdate = LocalDate.now();

// add Group Account

        group1.accounts = new Account[]{acc1};
        group2.accounts = new Account[]{acc1, acc2};
        group3.accounts = new Account[]{acc2};
        Account[] AccArr = {acc1, acc2, acc3};
        Department[] DepArr = {dep1, dep2, dep3};
//        Add CategoryQuestion
        CategoryQuestion catq1 = new CategoryQuestion();
        CategoryQuestion catq2 = new CategoryQuestion();
        CategoryQuestion catq3 = new CategoryQuestion();
        catq1.id = 1;
        catq1.name = "C";
        catq2.id = 2;
        catq2.name = "C++";
        catq3.id = 3;
        catq3.name = "C#";


//        Add Exam
        Exam ex1 = new Exam();
        Exam ex2 = new Exam();
        Exam ex3 = new Exam();
        ex1.id = 1;
        ex1.code = "a123";
        ex1.title = "Đề thi C";
        ex1.categoryId = catq1;
        ex1.duration = 60;
        ex1.creatorId = acc1;
        ex1.createdate = new Date();

        ex2.id = 2;
        ex2.code = "b123";
        ex2.title = "Đề thi C#";
        ex2.categoryId = catq3;
        ex2.duration = 90;
        ex2.creatorId = acc3;
        ex2.createdate = new Date();

        ex3.id = 3;
        ex3.code = "c123";
        ex3.title = "Đề thi C++";
        ex3.categoryId = catq2;
        ex3.duration = 60;
        ex3.creatorId = acc2;
        ex3.createdate = new Date();

// Chạy hàm
//    Exercise1
        Exercise1 exer1 = new Exercise1();
//        exer1.Question1(acc2);
//        exer1.Question2(acc2);
//        exer1.Question4(acc1);
//        exer1.Question3(acc2);
//        exer1.Question5(group1);
//        exer1.Question6(acc2);
//        exer1.Question7(acc1);
//        exer1.Question8(AccArr);
//        exer1.Question9(DepArr);
//        exer1.Question10(AccArr);
//        exer1.Question11(DepArr);
//        exer1.Qustion12(DepArr);
//        exer1.Question13(AccArr);
//        exer1.Question14(AccArr);
//        exer1.Question15();
//        exer1.Question16(AccArr,DepArr);
//        exer1.Question17(AccArr, DepArr);
//
//        Exercise2
        Exercise2 exer2 = new Exercise2();
        int a = 5;
//      exer2.Question1(a);
        int b = 100000000;
//        exer2.Question2(b);
        float c = 5.567098f;
//        exer2.Question3(c);
//        String s ="Nguyễn Văn A";
//        exer2.Question4(s);
//        Date datanow = new Date();
//        exer2.Question5(datanow);
//        exer2.Question6(AccArr);
//        Exercise 3
        Exam[] ExArr = {ex1, ex2, ex3};
        Exercise3 exer3 = new Exercise3();
//        exer3.Question1(ex1);
//        exer3.Question2(ExArr);
//        exer3.Question3(ExArr);
//        exer3.Question4(ExArr);
//        exer3.Question5(ExArr);
        Exercise4 exer4 = new Exercise4();
//        exer4.Question1();
//        exer4.Question2();
//        // Exercise 4 Question 3
//        String [] Arrname = {"Nguyen Van An ", "Nguyen Van An 1 ","Nguyen Van An 2 ","Nguyen Van An 3","Nguyen Van An 4"};
//        exer4.Question3(Arrname);
//        exer4.Question4();
//        exer4.Question5();
//        exer4.Question6();
//        exer4.Question7();
//        Exercise 5
        Exercise5 exer5 = new Exercise5();
//        exer5.Question1();
//        exer5.Question2();
//        exer5.Question3();
//        exer5.Question4();
//        exer5.Question5();
//        exer5.Question6();
//        exer5.Question7();
//        exer5.Question8();
//        exer5.Question9();
//        Quetstoin10
//        exer5.Question10();
          exer5.Question11();
//        Exercise6 exer6 = new Exercise6();
//        exer6.Question1();
//        exer6.Question2(AccArr);
//        exer6.Question3();



    }

};
