package com.testingsystem2;
import java.time.LocalDate;

public class Account {
      int id;
      String email;
      String username;
      String fullname;
      Department department;
      Position position ;
      LocalDate createdate ;
      Group[] groups;

      public Group[] getGroups() {
            return groups;
      }

      public void setGroups(Group[] groups) {
            this.groups = groups;
      }
}
