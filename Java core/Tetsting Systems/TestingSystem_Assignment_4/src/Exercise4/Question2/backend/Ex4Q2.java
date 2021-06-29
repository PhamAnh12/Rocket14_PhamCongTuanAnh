package Exercise4.Question2.backend;

import Exercise4.Question2.entity.AccountEx4;
import Exercise4.Question2.entity.Circle;
import Exercise4.Question2.entity.Date;

public class Ex4Q2 {
    public  void  showCircle(){
        Circle circle1 = new Circle(1d, "Red");
        Circle circle2 = new Circle(2d, "Blue");
        Circle circle3 = new Circle(3d, "Red");
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

     }
     public  void  showAccountEx4(){
         AccountEx4 acc1 = new AccountEx4("1","Nguyen  Van A", 100);
         AccountEx4 acc2 = new AccountEx4("2","Nguyen  Van B", 200);
         AccountEx4 acc3 = new AccountEx4("3","Nguyen  Van C", 200);
         System.out.println(acc1);
         System.out.println(acc2);
         System.out.println(acc3);

     }
     public  void  showDate(){
         Date  date1 = new Date(01,02,2021);
         Date  date2 = new Date(01,05,2021);
         Date  date3 = new Date(01,02,2020);
         Date [] dates = {date1,date2,date3};
         System.out.println(date1);
         System.out.println(date2);
         System.out.println(date3);
        for (Date date : dates ){
            if (date.isLeapYear()){
                System.out.println(date + " là năm nhuận.");
            }
            else
                System.out.println(date + " không là năm nhuận.");
        }


     }
}
