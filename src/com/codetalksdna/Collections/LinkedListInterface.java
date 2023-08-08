package com.codetalksdna.Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListInterface {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(200);
        linkedList.add(100);
        System.out.println(linkedList);
        linkedList.get(0);
        if (linkedList.contains(200)) {
            System.out.println("True Data Exist");
        }
    }
}
