package com.codetalksdna.Collections;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapImplementation {
    public static void main(String[] args) {
        NavigableMap<String,String> kvMap = new TreeMap<>();
        kvMap.put("2","Kavya");
        kvMap.put("5","Shivani");
        kvMap.put("1","Madhuri");
        kvMap.put("3","Indoo");
        kvMap.put("4","Nitesh");
        System.out.println(kvMap.descendingMap());

        SortedMap<String,String> kvMap1 = new TreeMap<>();
        kvMap1.put("2","Kavya");
        kvMap1.put("5","Shivani");
        kvMap1.put("1","Madhuri");
        kvMap1.put("3","Indoo");
        kvMap1.put("4","Nitesh");
        System.out.println(kvMap1);
    }
}
