package com.codetalksdna.CodingPrograms;

public class Employee {
    private long employeeId;
    private String employeeName;
    private int salary;

    Employee(int employeeId, String employeeName, int salary){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void work(){
        System.out.println("Employee is working");
    }
}
