package com.codetalksdna.Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClassImplementation {
    public static void main(String[] args) {
        Queue<Integer> integersQueue = new PriorityQueue<>();
        integersQueue.add(10);
        integersQueue.add(20);
        integersQueue.add(30);
        integersQueue.add(40);
        integersQueue.add(50);
        integersQueue.add(60);
        System.out.println(integersQueue.poll());
        System.out.println(integersQueue.remove());
        System.out.println(integersQueue.peek());
        System.out.println(integersQueue.offer(10));
        System.out.println(integersQueue);
    }
}
