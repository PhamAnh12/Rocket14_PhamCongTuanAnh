package Exercise2Q2.backend;

import Exercise2Q1.backend.Ex2Q1;
import Exercise2Q2.entity.Student;

import java.util.ArrayList;

public class Ex2Q2 {
    private Student student;
    public Ex2Q2(){
       student = new Student();
    }
    public  void  nhapthongtin(){
        student.inputInfo();
    }
    public void  inrathongtin(){
        System.out.println(student.showInfo());
    }
    public void xemhocbong(){
        if(student.xetHocBong()){
            System.out.println("Sinh viên được xét học bổng");
        }
        else
            System.out.println("Sinh viên này không được xét học bổng.");
    }
}
