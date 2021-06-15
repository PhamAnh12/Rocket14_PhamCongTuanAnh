package Exercise1;

import java.time.LocalDate;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createdate;
    Account[] accounts;
//    Question 3:
//    Tạo constructor cho Group:
//    a) không có parameters
    Group(){
        this.createdate = LocalDate.now();

    }
//    b) Có các parameter là GroupName, Creator, array Account[]
//accounts, CreateDate
    Group( String groupname,Account creator,  Account[]  accounts, LocalDate createdate){
        this.name = groupname;
        this.creator =creator;
        this.accounts = accounts;
        this.createdate = createdate;
    }
//   c) Có các parameter là GroupName, Creator, array String[]
//usernames , CreateDate
//Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//username, các thông tin còn lại = null).
    Group(String groupname, Account creator, String [] username, LocalDate createdate){
        this.name = groupname;
        this.creator = creator;
        Account [] accss =  new Account[username.length];
        for (int i = 0; i < username.length; i++){
            accss[i] = new Account(username[i]);
        }

        this.createdate = createdate;
    }
}
