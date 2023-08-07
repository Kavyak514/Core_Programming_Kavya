package com.codetalksdna.Multithreading;

public class AmountClass extends Thread {
    int amount = 0;

    @Override
    public void run() {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                amount = amount + 100;
            }
            this.notifyAll();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AmountClass amountClass = new AmountClass();
        synchronized (amountClass) {
            amountClass.start();
            amountClass.wait();
            System.out.println("Total Amount Available" + " " + amountClass.amount);
        }
    }
}
