package com.codetalksdna.CodingPrograms;

public class ImmutablecollegeClass {
    private int collegeId;
    private String collegeName;

    ImmutablecollegeClass(int collegeId, String collegeName){
        this.collegeId = collegeId;
        this.collegeName = collegeName;
    }
    public int getCollegeId(){
        return collegeId;
    }
    public String getCollegeName(){
        return collegeName;
    }
}

class Main {
    public static void main(String[] args) {

        // create object of Immutable
        ImmutablecollegeClass obj = new ImmutablecollegeClass(11, "JNTUH");

        System.out.println("Id: " + obj.getCollegeId());
        System.out.println("Name: " + obj.getCollegeName());
    }
}