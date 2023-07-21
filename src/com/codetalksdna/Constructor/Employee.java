package com.codetalksdna.Constructor;

public class Employee {
    String name;
    String age;

    public Employee(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
