package com.codetalksdna.Multithreading;

public class ThreadCountExample {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.setDaemon(true);
            thread.start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.fillInStackTrace();
        }

        System.out.println("Main thread exiting.");
    }

    public static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread count: " + Thread.activeCount());
        }
    }
}
