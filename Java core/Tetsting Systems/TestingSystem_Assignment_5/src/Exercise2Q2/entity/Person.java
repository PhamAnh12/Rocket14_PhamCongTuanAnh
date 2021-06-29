package Exercise2Q2.entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Person {
    private  String  name;
    private  String gender;
    private LocalDate date;
    private  String  addserr;

    public Person (){

    }
    public  Person(String name, String gender, LocalDate date, String addserr){
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.addserr = addserr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getAddserr() {
        return addserr;
    }

    public void setAddserr(String addserr) {
        this.addserr = addserr;
    }
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập giới tính: ");
        this.gender = sc.nextLine();
        System.out.println("BirthDate nhập theo định dạng yyyy-MM-dd: ");
        this.date = LocalDate.parse(sc.next());
        System.out.println("Nhập địa chỉ: ");
        this.addserr = sc.next();
    }

    public  String showInfo(){
        return  "{ Name: " + this.name + " Giới tính: " + this.gender + " Ngày sinh: " + this.date + " Địa chỉ: " + this.addserr ;
    }
}
