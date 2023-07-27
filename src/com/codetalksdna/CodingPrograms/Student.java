package com.codetalksdna.CodingPrograms;

public class Student {
    private int sid;
    private String sName;
    private float grade;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public float getGrade() {
        return grade;
    }

    public void addGrade(float grade) {
        if(grade > 0)
        this.grade = grade;
    }
}
