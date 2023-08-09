package com.codetalksdna.Collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetImplementation {
    public static void main(String[] args) {
        SortedSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(200);
        treeSet.add(100);
        treeSet.add(300);
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(80);
        System.out.println(treeSet);
        System.out.println(treeSet.headSet(50));
        System.out.println(treeSet.tailSet(100));
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        SortedSet<String> treeSetString = new TreeSet<>();
        treeSetString.add("Nitesh");
        treeSetString.add("Kavya");
        treeSetString.add("Madhuri");
        treeSetString.add("Indoo");
        treeSetString.add("Shivani");
        System.out.println(treeSetString);
        System.out.println(treeSetString.headSet("Madhuri"));
        System.out.println(treeSetString.tailSet("Shivani"));
        System.out.println(treeSetString.first());
        System.out.println(treeSetString.last());
    }
}
