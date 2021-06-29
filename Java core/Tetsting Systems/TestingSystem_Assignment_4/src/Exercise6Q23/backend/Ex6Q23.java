package Exercise6Q23.backend;

import Exercise6Q23.entity.Employee;
import Exercise6Q23.entity.Manager;
import Exercise6Q23.entity.User;
import Exercise6Q23.entity.Waiter;

import java.util.ArrayList;

public class Ex6Q23 {
    private ArrayList<User> users;
    public  Ex6Q23(){
        users = new ArrayList<>();
        users.add(new Employee("Nguyen Van A",200d));
        users.add(new Manager("Nguyen Van B", 500d));
        users.add(new Waiter("Nguyen Van C", 100d));
    }
    public  void showUser(){
        for (User user : users){
            user.displayInfor();
        }
    }
}
