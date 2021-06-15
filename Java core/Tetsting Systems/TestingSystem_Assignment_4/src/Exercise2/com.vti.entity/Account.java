package Exercise2.com.vti.entity;

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
}
