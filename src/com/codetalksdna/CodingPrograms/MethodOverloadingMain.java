package com.codetalksdna.CodingPrograms;

public class MethodOverloadingMain {

    public static void main(String[] args) {
        MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample(1, "Kavya", 1223434344);
        System.out.println("student number is "+methodOverloadingExample.getsNumber());
        methodOverloadingExample.getStudentData(methodOverloadingExample.getSid());
        methodOverloadingExample.setSid(12);
        System.out.println("sid changed");
        methodOverloadingExample.getStudentData(methodOverloadingExample.getSid());
        methodOverloadingExample.getStudentData(methodOverloadingExample.getSid(), methodOverloadingExample.getsName());

    }
}
