package com.codetalksdna.Constructor;

public class College {
    String collegeName = "JNTU";
    public void myCollege() {
        System.out.println(collegeName.concat("H"));
    }
}

class Student extends College {
    String collegeName = "JNTUH";

    public void myCollege() {
        System.out.println(super.collegeName);
        System.out.println(collegeName);
        super.myCollege();
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.myCollege();
    }
}

