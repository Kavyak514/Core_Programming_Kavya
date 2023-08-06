package com.codetalksdna.Multithreading;

public class RunnableInterfaces implements Runnable{

    @Override
    public void run() {
        System.out.println("Welcome to Java");
    }

    public static void main(String[] args) {
        Thread threadClass = new Thread(new RunnableInterfaces());
        threadClass.start();
        System.out.println(Thread.activeCount());
        threadClass.start();
        System.out.println(Thread.activeCount());
    }
}