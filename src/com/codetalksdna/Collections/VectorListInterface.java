package com.codetalksdna.Collections;

import java.util.List;
import java.util.Vector;

public class VectorListInterface {
    public static void main(String[] args) {
        List<Integer> vector = new Vector<>();
        vector.add(200);
        vector.add(100);
        System.out.println(vector);
        System.out.println(vector.get(0));
        if (vector.contains(200)) {
            System.out.println("True Data Exist");
        }
    }
}
