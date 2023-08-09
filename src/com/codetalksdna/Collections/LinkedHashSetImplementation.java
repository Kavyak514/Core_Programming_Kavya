package com.codetalksdna.Collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetImplementation {
    public static void main(String[] args) {
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(200);
        linkedHashSet.add(100);
        linkedHashSet.add(300);
        linkedHashSet.add(400);
        linkedHashSet.add(500);
        linkedHashSet.add(600);
        linkedHashSet.add(null);
        System.out.println(linkedHashSet);
    }
}
