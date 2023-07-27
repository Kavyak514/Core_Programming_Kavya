package com.codetalksdna.CodingPrograms;

public class EmployeeEncapsulation {
    private long employeeId;
    private String employeeName;
    private int salary;

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String formattedSalary(int salary){
        return Integer.toString(salary);
    }
}
