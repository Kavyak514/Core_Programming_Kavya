package com.codetalksdna.CodingPrograms;

public class MethodOverloadingExample {
    private int sid;
    private String sName;
    private long sNumber;

    MethodOverloadingExample(int sId, String sName, long sNumber){
        this.sid = sId;
        this.sName = sName;
        this.sNumber = sNumber;
    }

    public void getStudentData(int sid){
        System.out.println("student id is "+sid);
    }

    public void getStudentData(int sid, String sName){
        System.out.println("student id is "+sid+" and student name is "+sName);
    }

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

    public long getsNumber() {
        return sNumber;
    }

    public void setsNumber(long sNumber) {
        this.sNumber = sNumber;
    }
}
