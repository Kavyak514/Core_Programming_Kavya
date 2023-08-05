package com.codetalksdna.Multithreading;

public class CountThread1 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.activeCount());
        Thread thread1 = new Thread(() -> {
            System.out.println("Welcome to Java");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("Welcome to Java");
        });
        thread2.start();
        thread1.start();
        System.out.println(Thread.activeCount());
    }
}