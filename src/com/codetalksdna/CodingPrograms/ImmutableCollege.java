package com.codetalksdna.CodingPrograms;

public class ImmutableCollege {
    private final int collegeId;
    private final String collegeName;

    ImmutableCollege(int collegeId, String collegeName){
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
        ImmutableCollege obj = new ImmutableCollege(11, "JNTUH");
        System.out.println("Id: " + obj.getCollegeId());
        System.out.println("Name: " + obj.getCollegeName());
    }
}