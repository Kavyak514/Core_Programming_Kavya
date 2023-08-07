package com.codetalksdna.Multithreading;

public class ThreadClassRunnableExample implements Runnable {
    private int threadNumber;
    public ThreadClassRunnableExample(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println(j + " " + "Count" + threadNumber);
            if(threadNumber == 3){
                throw new RuntimeException();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for (int j = 1; j <= 5; j++) {
            ThreadClassRunnableExample threadClassExample = new ThreadClassRunnableExample(j);
            Thread thread = new Thread(threadClassExample);
            thread.start();
        }
    }
}
