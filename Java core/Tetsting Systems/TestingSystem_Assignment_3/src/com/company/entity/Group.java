package com.company.entity;
 import java.time.LocalDate;

public class Group {
    public  int id;
    public  String name;
    public  Account creator;
    public  LocalDate createdate;
    public  Account [] accounts;

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
