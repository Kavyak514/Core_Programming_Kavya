package com.codetalksdna.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVersusVector {
    public static void main(String[] args) {
        int size = 100000000;
        long startTime = System.currentTimeMillis();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            integerList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken By the ArrayList is"+" "+ (endTime-startTime));

        long startTime1 = System.currentTimeMillis();
        List<Integer> integerVector = new Vector<>();
        for (int i = 0; i < size; i++) {
            integerVector.add(i);
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time Taken By the Vector is"+" "+ (endTime1-startTime1));
    }
}
