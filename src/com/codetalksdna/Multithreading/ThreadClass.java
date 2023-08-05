package com.codetalksdna.Multithreading;

public class ThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Welcome to Java");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadClass threadClass = new ThreadClass();
        threadClass.start();
    }
}
