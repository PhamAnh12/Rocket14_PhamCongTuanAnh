package com.company.backend;

import com.company.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public List<Student> Khoitao() {
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1, "Nguyen Van A");
        Student student2 = new Student(2, "Nguyen Van A");
        Student student3 = new Student(3, "Nguyen Van A");
        Student student4 = new Student(4, "Nguyen Van B");
        Student student5 = new Student(5, "Nguyen Van C");
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
       return students;
    }
//  a) In ra tổng số phần tử của students
    public void Question1a() {
        List<Student> students =  Khoitao();
        System.out.println("Tổng số phần tử của students: " + students.size());
    }

    //b) Lấy phần tử thứ 4 của students
    public void Question1b() {
        List<Student> students =  Khoitao();
        System.out.println("Phần tử thứ 4 của students là: " + students.get(3).getId() + " " + students.get(3).getName());
    }

    // c) In ra phần tử đầu và phần tử cuối của students
    public void Question1c() {
        List<Student> students =  Khoitao();
        System.out.println("Phần tử  đàu của students là: " + students.get(0).getId() + " " + students.get(0).getName());
        System.out.println("Phần tử cuối của students là: " + students.get(students.size() - 1).getId() + " " + students.get(students.size() - 1).getName());
    }
}
