package com.company.frontend;


import com.company.backend.Exercise2;
import com.company.entity.Student;

public class Main1 {

    public static void main(String[] args) {
        Exercise2 exer2 = new Exercise2();
        exer2.Question1();
        Student st = new Student("Nguyen Van A");
        System.out.println("Name: "+ st.getName()  );
        st.getId();


    }
    @Deprecated
    public String in() {
        return "123";
    }

}
