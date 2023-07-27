package com.codetalksdna.CodingPrograms;

public class EmployeeEncapsulationMain {
    public static void main(String[] args) {
        EmployeeEncapsulation employeeEncapsulation = new EmployeeEncapsulation();
        employeeEncapsulation.setEmployeeId(123);
        employeeEncapsulation.setEmployeeName("Kavya");
        employeeEncapsulation.setSalary(1213242343);
        employeeEncapsulation.formattedSalary(employeeEncapsulation.getSalary());
        System.out.println(employeeEncapsulation.getEmployeeId() +", " +
                ""+ employeeEncapsulation.getEmployeeName()+ ", "+employeeEncapsulation.getSalary()+", " +
                ""+employeeEncapsulation.formattedSalary(4555));
    }
}
