package Exercise1;

import java.time.LocalDate;

public class Ex1 {
    //        Question1:
    public  static  void  Question1(){
        Department dep1 = new Department();
        Department dep2 = new Department("Bảo vệ");
        System.out.println("Deparment1 " + "id: " + dep1.id + " name:  " + dep1.name);
        System.out.println("Deparment2 " + "id: " + dep2.id + " name: " + dep2.name);
    }
//    Question 2
    public  static  void  Question2(){
        System.out.println("Exercise1 Question2 a: ");
        Account acc1 = new Account();
        System.out.println("Account1:  " + "Id: "+acc1.id + "Email:  " + acc1.email+" UserName:  "+acc1.username +" FullName: "+ acc1.fullname  + "  Createdate: "+acc1.createdate );
        System.out.println("Exercise1 Question2 b: ");
        Account acc2 = new Account(2,"phamcongtuananh@gmail.com", "phamanh123","Phạm Công ","Tuấn Anh");
        System.out.println("Account2:  " + "Id: "+acc2.id + " Email:  " + acc2.email+" UserName:  "+acc2.username +" FullName: "+ acc2.fullname   );
        System.out.println("Exercise1 Question2 c: ");
        Position pos1 = new Position();
        pos1.name = Position.PositionName.Dev;
        Account acc3 = new Account(3,"phamcongtuananh@gmail.com", "phamanh1234","Phạm Công ","Tuấn Anh" ,pos1);
        System.out.println("Account3:  " + "Id: "+acc3.id + " Email:  " + acc3.email+" UserName:  "+acc3.username +" FullName: "+ acc3.fullname + " Posittion Name: " + acc3.position.name + " CreateDate: " + acc3.createdate );
        System.out.println("Exercise1 Question2 d: ");
        LocalDate date = LocalDate.of(2021, 5,15);
        Account acc4 = new Account(4,"phamcongtuananh@gmail.com", "phamanh1234","Phạm Công ","Tuấn Anh" ,pos1,date);
        System.out.println("Account4:  " + "Id:  "+acc4.id + " Email:  " + acc4.email+" UserName:  "+acc4.username +" FullName: "+ acc4.fullname + " Posittion Name: " + acc4.position.name +  " Createdate: "  + acc4.createdate);

    }
//    Question 3
    public  static  void  Question3(){
        Group gr1 = new Group();
        System.out.println("Exercise1 Question3 a: ");
        System.out.println("Group ID: " + gr1.id + " Group Name: " + gr1.name + " Group Createdate: " +  gr1.createdate);
        System.out.println("Exercise1 Question3 b: ");
        Account acc1 = new Account(3,"phamcongtuananh@gmail.com", "phamanh12345","Phạm Công ","Tuấn Anh" );
        Account acc4 = new Account(4,"phamcongtuananh@gmail.com", "phamanh1234","Phạm Công ","Tuấn Anh" );
        Account [] accs  = {acc1,acc4};
        LocalDate date1 = LocalDate.now();
        Group gr2 = new Group("nhom1", acc1,accs, date1);
        System.out.println("Exercise1 Question3 b: ");
        System.out.println("Group name: " + gr2.name + " Creator: " + gr2.creator + " Createdate: " + gr2.createdate);
        System.out.println("Exercise1 Question3 c: ");
        String [] strings = {"1234,qwert1234,56788,1223333"};
        Group gr3 = new Group("nhom2", acc1,strings, date1);
        System.out.println("Group name: " + gr3.name + " Creator: " + gr3.creator +  " Createdate: " + gr3.createdate );


    }
}
