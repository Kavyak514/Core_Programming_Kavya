package com.codetalksdna.Multithreading;

public class Multithreading2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread in working Condition is" + " " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Multithreading2 multithreading1 = new Multithreading2();
            Thread thread = new Thread(multithreading1);
            thread.start();
        }
    }
}
