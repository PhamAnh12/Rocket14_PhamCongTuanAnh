package Exercise2Q2.entity;

import java.util.Scanner;

public class Student  extends  Person{
    private  int id;
    private  double diemTB;
    private  String  email;
    public  static  int COUNT = 0;
    public  Student(){
        COUNT++;
        this.id = COUNT;
    }
    @Override
    public void inputInfo(){
        Scanner sc = new Scanner(System.in);
        super.inputInfo();
        System.out.println("Nhập điểm TB: ");
        this.diemTB = sc.nextDouble();
        System.out.println("Nhập Email : ");
        this.email = sc.next();
    }
    @Override
    public  String  showInfo(){
        return  super.showInfo() + " ID:" + this.id + " Điểm trung bình:" + this.diemTB + " Email: " + this.email + "}";
    }
    public  boolean xetHocBong(){
        return  diemTB >= 8.0 ? true : false;
    }
}
