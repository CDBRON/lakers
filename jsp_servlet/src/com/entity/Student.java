package com.entity;

public class Student {
    private String sno;
    private String password;
    private String name;

    public Student(String sno, String password, String name) {
        this.sno = sno;
        this.password = password;
        this.name = name;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}