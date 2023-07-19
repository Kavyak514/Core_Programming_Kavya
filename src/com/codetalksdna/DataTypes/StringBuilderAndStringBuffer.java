package com.codetalksdna.DataTypes;

import java.time.Instant;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        int number = 10000000;
        int j = 0;
        StringBuilder name = new StringBuilder("Nitesh" + " ");
        long start = Instant.now().getEpochSecond();
        for (int i = 0; i < number; i++) {
            j++;
            name.append(i);
        }
        System.out.println("Count of Builder Class" + " " + j);
        long end = Instant.now().getEpochSecond();
        long timeTaken = end - start;

        StringBuffer names = new StringBuffer("Nitesh" + " ");
        int k = 0;
        long start1 = Instant.now().getEpochSecond();
        for (int i = 0; i < number; i++) {
            k++;
            names.append(i);
        }
        System.out.println("Count of Buffer Class" + " " + k);
        long end1 = Instant.now().getEpochSecond();
        long timeTaken1 = end1 - start1;

        if (timeTaken > timeTaken1) {
            System.out.println("String Builder is faster");
        } else {
            System.out.println("String Buffer is faster");
        }
    }
}
