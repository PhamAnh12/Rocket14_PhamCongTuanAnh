package com.testingsystem2;

public class Exercise6 {
//    Question 1:
//Tạo method để in ra các số chẵn nguyên dương nhỏ hơn 10
    public  static  void Question1(){
        System.out.println(" Exercie6 Question1: ");
        System.out.println(" Các số chẵn nguyên dương nhỏ hơn 10: ");
        for (int i =1 ; i <=10;i++){
            if(i%2 == 0 ){
                System.out.print(i + " ");
            }
        }
    }
//    Question 2:
//Tạo method để in thông tin các account
    public  static  void  Question2(Account [] accArr){
        System.out.println(" Exercie6 Question2: ");
        for (int i = 0; i < accArr.length; i++){
            System.out.println("Account " + (i+1) + ": ");
            System.out.println("AccountID " + (i+1) + ": " + accArr[i].id);
            System.out.println("Email " + (i+1) + ": " + accArr[i].email);
            System.out.println("Username " + (i+1) + ": " + accArr[i].username);
            System.out.println("FullName " + (i+1) + ": " +  accArr[i].fullname);
            System.out.println("DepartmentName " + (i+1) + ": " + accArr[i].department.name);
            System.out.println("Position Name" + (i+1) + ": " + accArr[i].position.name);
            System.out.println("Create Date  " + (i+1) + ": " + accArr[i].createdate);

        }
    }
    //    Question 3:
//Tạo method để in ra các số nguyên dương nhỏ hơn 10
    public  static  void Question3(){
        System.out.println(" Exercie6 Question3: ");
        System.out.println("Các số chẵn nguyên dương nhỏ hơn 10: ");
        for (int i =1 ; i <=10;i++){

                System.out.print(i + " ");

        }
    }
}
