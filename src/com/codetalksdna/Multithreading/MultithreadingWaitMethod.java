package com.codetalksdna.Multithreading;

public class MultithreadingWaitMethod {
    private static final Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " Thread is Up after 1 second");
        synchronized (obj) {
            obj.wait(1000);
            System.out.println(obj + " Object is in waiting state and woken after 1 seconds");
        }
    }
}
