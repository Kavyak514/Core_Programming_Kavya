package com.codetalksdna.Multithreading;

public class ThreadClassExample extends Thread {
    private int threadNumber;
    public ThreadClassExample(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println(j + " " + "Count");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        for (int j = 1; j <= 5; j++) {
            ThreadClassExample threadClassExample = new ThreadClassExample(j);
            ThreadClassExample threadClassExample1 = new ThreadClassExample(j);
            threadClassExample.start();
            threadClassExample1.start();
        }
    }
}
