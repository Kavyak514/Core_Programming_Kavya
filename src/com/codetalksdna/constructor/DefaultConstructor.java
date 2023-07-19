package com.codetalksdna.constructor;

public class DefaultConstructor {
    public static void main(String[] args) {
        Employee employee = new Employee("Sridevi" ,"40");
        System.out.println(employee.age);
        System.out.println(employee.name);
        employee.age = "28";
        employee.name = "Nitesh";
        System.out.println(employee.age);
        System.out.println(employee.name);
    }
}
