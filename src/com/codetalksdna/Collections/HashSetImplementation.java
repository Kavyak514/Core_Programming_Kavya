package com.codetalksdna.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementation {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(200);
        hashSet.add(100);
        hashSet.add(300);
        hashSet.add(400);
        hashSet.add(500);
        hashSet.add(600);
        hashSet.add(null);
        System.out.println(hashSet);
        hashSet.remove(200);
        for (Integer integer : hashSet) {
            System.out.println(integer);
        }
        if (hashSet.contains(200)) {
            System.out.println("True Data Exist");
        }
    }
}
