package Exercise1;

import java.time.LocalDate;

public class Account {
    int id;
    String email;
    String username;
    String fullname;
    Department department;
    Position position;
    LocalDate createdate;
    Group[] groups;

    //  Question 2:
//Tạo constructor cho Account:
//a) Không có parameters
    Account() {
        this.createdate = LocalDate.now();
    }

    //b) Có các parameter là id, Email, Username, FirstName,
//LastName (với FullName = FirstName + LastName)
    Account(int id, String email, String username, String firstname, String lastname) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullname = firstname + lastname;
    }

    //c) Có các parameter là id, Email, Username, FirstName,
//LastName (với FullName = FirstName + LastName) và
//Position của User, default createDate = now
    Account(int id, String email, String username, String firstname, String lastname, Position pos1) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullname = firstname + lastname;
        this.position= pos1;
        this.createdate = LocalDate.now();
    }

    //d) Có các parameter là id, Email, Username, FirstName,
//LastName (với FullName = FirstName + LastName) và
//Position của User, createDate
    Account(int id, String email, String username, String firstname, String lastname, Position pos1, LocalDate date) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullname = firstname + lastname;
        this.position =pos1;
        this.createdate = date;
    }
    Account(String username){
        this.username = username;
    }
}
