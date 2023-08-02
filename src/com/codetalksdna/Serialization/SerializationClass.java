package com.codetalksdna.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
    String name;
    String rollNo;
}

public class SerializationClass {
    public static void main(String[] args) throws IOException {
        Student student = new Student();
        student.name ="Nitesh";
        student.rollNo="Two";

        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();
    }
}
