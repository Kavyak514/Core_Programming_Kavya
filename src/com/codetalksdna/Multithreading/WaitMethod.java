package com.codetalksdna.Multithreading;

public class WaitMethod extends Thread {
    int total = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                total = total + 100;
            }
            this.notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WaitMethod waitMethod = new WaitMethod();
        synchronized (waitMethod) {
            waitMethod.start();
            waitMethod.wait();
            System.out.println(waitMethod.total);
        }
    }
}
