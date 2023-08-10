package com.codetalksdna.Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class DeQueueClassImplementation {
    public static void main(String[] args) {
        Deque<Integer> integersQueue = new ArrayDeque<>();
        integersQueue.add(10);
        integersQueue.add(20);
        integersQueue.add(30);
        integersQueue.add(40);
        integersQueue.add(50);
        integersQueue.add(60);
        System.out.println(integersQueue.offerFirst(70));
        System.out.println(integersQueue);
        System.out.println(integersQueue.offerLast(80));
        System.out.println(integersQueue);
        System.out.println(integersQueue.offer(90));
        System.out.println(integersQueue);
        System.out.println(integersQueue.getFirst());
        System.out.println(integersQueue.remove());
        System.out.println(integersQueue.peek());
    }
}
