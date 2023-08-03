package com.codetalksdna.Serialization;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 123456789L;
    static String name;
    String rollNo;
    String userName;
    transient String password;
}
