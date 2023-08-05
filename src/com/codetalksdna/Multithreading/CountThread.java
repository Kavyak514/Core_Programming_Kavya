package com.codetalksdna.Multithreading;

public class CountThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Welcome to Java");
    }

    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread();
            thread.start();
        }
        System.out.println(Thread.activeCount());
    }
}
