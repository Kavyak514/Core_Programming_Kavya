package com.codetalksdna.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapImplementation {
    public static void main(String[] args) {
        Map<String, String> kvMap = new LinkedHashMap<>();
        kvMap.put("2", "Kavya");
        kvMap.put("5", "Shivani");
        kvMap.put("1", "Madhuri");
        kvMap.put("3", "Indoo");
        kvMap.put("4", "Nitesh");
        System.out.println(kvMap);
    }
}
