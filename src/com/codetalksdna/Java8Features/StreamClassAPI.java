package com.codetalksdna.Java8Features;

import java.util.ArrayList;
import java.util.List;

public class StreamClassAPI {
    public static void main(String[] args) {
        int size = 50;
        List<Integer> evenNumberList = new ArrayList<>();
        for (int i = 1; i < size; i++) {
            if (i % 2 == 0) {
                evenNumberList.add(i);
            }
        }
        System.out.println(evenNumberList);
        streamLoop(size);
    }

    public static void streamLoop(int size) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numberList.add(i);
        }
        List<Integer> evenIntegersList = numberList.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(evenIntegersList);
    }
}
