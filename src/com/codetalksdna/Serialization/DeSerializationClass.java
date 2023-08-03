package com.codetalksdna.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationClass {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student student = (Student) objectInputStream.readObject();
        System.out.println(student.name);
        System.out.println(student.rollNo);
        System.out.println(student.userName);
        System.out.println(student.password);
        objectInputStream.close();
        fileInputStream.close();
    }
}
