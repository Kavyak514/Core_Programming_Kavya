package com.codetalksdna.ExceptionHandling;

import com.codetalksdna.Constructor.Employee;

public class Errors {
    public static void main(String[] args) {
        int value = 1000000000;
        for (int i = 0; i < value; i++) {
            Employee employee = new Employee();
            System.out.println("Thanks for Blowing the Code " + employee.getAge());
        }
    }
}
