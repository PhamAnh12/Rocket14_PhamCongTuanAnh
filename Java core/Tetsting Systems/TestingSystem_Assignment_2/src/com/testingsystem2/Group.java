package com.testingsystem2;
 import java.time.LocalDate;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createdate;
    Account [] accounts;

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
