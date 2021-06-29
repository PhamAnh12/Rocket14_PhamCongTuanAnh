package com.company;

import com.company.entity.Department;

public class Exercise5 {
    //    Question 1:
//In ra thông tin của phòng ban thứ 1 (sử dụng toString())
    public void Question1(Department d1) {
        System.out.println("Exercise5 Question1: ");
        System.out.println(d1.toString());
    }

    //Question 2:
//In ra thông tin của tất cả phòng ban (sử dụng toString())
    public void Question2(Department[] dearr) {
        System.out.println("Exercise5 Question2: ");
        for (Department de : dearr)
            System.out.println(de.toString());
    }

    //Question 3:
//In ra địa chỉ của phòng ban thứ 1
    public void Question3(Department d1) {
        System.out.println("Exercise5 Question3: ");
        System.out.println(d1.hashCode());
    }

    //Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
    public void Question4(Department d1) {
        System.out.println("Exercise5 Question4: ");
        if (d1.name.equals("Phòng A")) {
            System.out.println("Phòng ban thứ 1 có phòng tên là A");
        } else {
            System.out.println("Phòng ban thứ 1  Không có tên là A");
        }
    }

    //Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau
//không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
    public static void Question5(Department de1, Department de2) {
        if (de1.equals(de2)) {
            System.out.println("Có bằng nhau !");
        } else {
            System.out.println("Không bằng nhau !");
        }
    }

    //    Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh
//sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
//VD:
//Accounting
//Boss of director
//Marketing
//Sale
//Waiting room
    public static void Question6(Department[] departments) {
// order by
        for (int i = 0; i < departments.length; i++) {
            for (int j = 0; j < departments.length - 1; j++) {
                if (departments[i].name.compareToIgnoreCase(departments[j].name) <
                        0) {
// swap
                    Department temp = departments[i];
                    departments[i] = departments[j];
                    departments[j] = temp;
                }
            }
        }
    }

    //    Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh
//sách phòng ban được sắp xếp theo tên
//VD:
//Accounting
//Boss of director
//Marketing
//waiting room
//Sale
    public String Nguocchuoi(String st) {
        String [] starr = st.split(" ");
        st = starr[starr.length -1];
        st = st.substring(0,1);
        return st;
    }
    public  void  Question7(Department [] des){
        for (int i = 0; i < des.length; i++) {
            for (int j = 0; j < des.length - 1; j++) {
               if(Nguocchuoi(des[i].name).compareToIgnoreCase(Nguocchuoi(des[j].name))  < 0) {
// swap
                    Department temp = des[i];
                    des[i] = des[j];
                    des[j] = temp;
                }
            }
        }
        inra(des);
    }
    public  void  inra(Department []  des){
        for (int i = 0; i < des.length;i++){
            System.out.println(des[i].name);
        }
    }
}
