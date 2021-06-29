package com.company;

import com.company.entity.Department;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Exercise1 exer1 = new Exercise1();
//        exer1.Question1();
//        exer1.Question2();
//        exer1.Question3();
//        System.out.println("Thương của hai số là: " + exer1.Question4());
        Exercise2 exer2 = new Exercise2();
//        exer2.question1();
        Exercise3 exer3 = new Exercise3();
//        exer3.Question1();
//        exer3.Question2();
        Exercise4 exer4 = new Exercise4();
//        exer4.Question1();
//        exer4.Question2();
//        exer4.Question3();
//        exer4.Question4();
//        exer4.Question5();
//        exer4.Question6();
//        exer4.Question7();
//        exer4.Question8();
//        exer4.Question9();
//        exer4.Question10();
//        exer4.Question11();
//        exer4.Question12();
//        exer4.Question13();
//        exer4.Question14();
//        exer4.Question15();
//        exer4.Question16();

        Department de1 = new Department();
        de1.id = 1;
        de1.name = "Sale";
        Department de2 = new Department();
        de2.id = 2;
        de2.name = "Marketing";
        Department de3 = new Department();
        de3.id = 3;
        de3.name = "Boss of director";
        Department de4 = new Department();
        de4.id = 4;
        de4.name = "Waiting room";
        Department[] departments = {de1, de2, de4, de3};
        Exercise5 exer5 = new Exercise5();
//        exer5.Question1(de1);
//        exer5.Question2(departments);
//        exer5.Question3(de1);
//        exer5.Question4(de1);
//        exer5.Question5(de1,de2);
//        exer5. Question6(departments);

         exer5.Question7(departments);


    }

}
