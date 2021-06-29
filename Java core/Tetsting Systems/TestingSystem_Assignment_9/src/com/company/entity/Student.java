package com.company.entity;

public class Student {
    public static  int count = 0;
    private int  id;
    private String name;
    public Student( String name ){
        this.id = ++count;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Deprecated
    public int getId() {
        return id;
    }
    public String getIdMSV() {
        return "MSV" + id;
    }
}
