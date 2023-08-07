package com.codetalksdna.Multithreading;

public class Multithreading1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread in working Condition is" + " " + Thread.currentThread().getId());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            Multithreading1 multithreading1 = new Multithreading1();
            multithreading1.start();
        }
    }
}
