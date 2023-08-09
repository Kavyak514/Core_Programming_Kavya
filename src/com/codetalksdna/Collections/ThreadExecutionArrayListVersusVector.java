package com.codetalksdna.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ThreadExecutionArrayListVersusVector {
    public static void main(String[] args) throws InterruptedException {
        int size = 10000000;
        long startTime = System.currentTimeMillis();
        List<Integer> integerList = new ArrayList<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                integerList.add(i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                integerList.add(i);
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long endTime = System.currentTimeMillis();
        System.out.println("Time Taken By the ArrayList is" + " " + (endTime - startTime));
        System.out.println("Size of the ArrayList" + " " + integerList.size());

        long startTime1 = System.currentTimeMillis();
        List<Integer> integerVector = new Vector<>();
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                integerVector.add(i);
            }
        });
        Thread thread4 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                integerVector.add(i);
            }
        });
        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time Taken By the Vector is" + " " + (endTime1 - startTime1));
        System.out.println("Size of the Vector is" + " " + integerVector.size());
    }
}
