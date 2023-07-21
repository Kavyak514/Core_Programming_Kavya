package com.codetalksdna.Objects;

import java.util.*;
import java.lang.*;

public class NewInstanceKeyword {
    public static void main(String[] args) {
        try {
            Date d = new Date();
            Class cls = d.getClass();
            System.out.println("Time = " + d);
            Object obj = cls.newInstance();
            System.out.println("Time = " + obj);
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}