package Exercise2.com.vti.entity;

import java.time.LocalDate;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createdate;
    Account[] accounts;
}
