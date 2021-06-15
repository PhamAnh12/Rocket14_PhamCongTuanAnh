package com.company.backend;

import com.company.entity.Student;

import java.util.Scanner;

public class Exercise1 {
    public void Question1(){
        Student st1  = new Student(1, "Nguyễn Văn A");
        Student st2  = new Student(2, "Nguyễn Văn B");
        Student st3  = new Student(3, "Nguyễn Văn C");
        Student.setCollege( "Đại học bách khoa");
        Student [] starr ={st1,st2,st3};
        inraStudent(starr);
        Student.setCollege( "Đại học Công Nghệ");
        inraStudent(starr);
    }
    public  void  inraStudent(Student [] starr){
        for (Student st : starr ){
            System.out.println(st.toString());
        }
    }
}
