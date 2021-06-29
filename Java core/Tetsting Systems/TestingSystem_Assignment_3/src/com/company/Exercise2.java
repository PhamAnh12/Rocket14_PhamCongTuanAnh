package com.company;

import com.company.entity.*;

import java.time.LocalDate;

public class Exercise2 {
    //    Question 1:
//Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi
//tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
// Email: "Email 1"
// Username: "User name 1"
// FullName: "Full name 1"
// CreateDate: now
    public void question1() {
        System.out.println("Exercise2 Question1: ");
        System.out.println("Khởi tạo mảng Account gồm 5 phần tử sử dụng For");
        Account[] accArray = new Account[5];
        for (int i = 0; i < accArray.length; i++) {
            Account acc = new Account();
            acc.email = "nguyenvanA" + i + "@gmail.com";
            acc.username = "nguyenvana" + i;
            acc.fullname = "Nguyễn Văn A" + i;
            acc.createdate = LocalDate.now();
            accArray[i] = acc;
            System.out.println(
                    "Thông tin Account " + i + " Email: " +
                            accArray[i].email + " UserName: " + accArray[i].username
                            + " FullName: " +
                            accArray[i].fullname + " CreateDate: " + accArray[i].createdate);

        }
    }
}